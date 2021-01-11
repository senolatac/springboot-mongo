package com.sha.springbootmongo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.core.convert.DbRefResolver;
import org.springframework.data.mongodb.core.convert.DefaultDbRefResolver;
import org.springframework.data.mongodb.core.convert.DefaultMongoTypeMapper;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;
import org.springframework.data.mongodb.core.mapping.MongoMappingContext;

/**
 * @author sa
 * @date 1/10/21
 * @time 2:24 PM
 */
@Configuration
public class MongoConfig
{
    @Bean
    public MappingMongoConverter mappingMongoConverter(MongoDatabaseFactory factory,
                                                       MongoMappingContext context)
    {
        DbRefResolver dbRefResolver = new DefaultDbRefResolver(factory);
        MappingMongoConverter mappingMongoConverter = new MappingMongoConverter(dbRefResolver, context);

        // Don't save _class field to mongoDB
        mappingMongoConverter.setTypeMapper(new DefaultMongoTypeMapper(null));

        return mappingMongoConverter;
    }
}
