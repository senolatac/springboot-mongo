package com.sha.springbootmongo.repository;

import com.sha.springbootmongo.model.User;
import com.sha.springbootmongo.projection.CountryAggregation;
import com.sha.springbootmongo.projection.UserAggregation;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
import java.util.Optional;

/**
 * @author sa
 * @date 1/10/21
 * @time 11:59 AM
 */
public interface IUserRepository extends MongoRepository<User, String>
{
    //findBy + fieldName
    Optional<User> findByUsername(String username);

    //value: where condition
    //fields: select items: 1 => include, 0 => exclude
    //sort: 1 => ASC, -1 => DESC
    @Query(value="{ country: ?0 }", fields="{ name: 1, _id: 0 }", sort="{ name: -1 }")
    List<User> findByCountryAsCustom(String country);

    //select country, sum(1) = count(*) from users group by country
    @Aggregation("{ $group: { _id : $country, total : { $sum : 1 } } }")
    List<CountryAggregation> countByCountry();

    //select country, [names] from user group by country
    @Aggregation("{ $group: { _id : $country, names : { $addToSet : $name } } }")
    List<UserAggregation> groupByCounty();
}
