package com.sha.springbootmongo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

/**
 * @author sa
 * @date 1/9/21
 * @time 10:32 PM
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "users")
public class User
{
    //It will link to _id field on da and generated automatically.
    @Id
    private String id;

    @Indexed(unique = true)
    private String username;

    private String name;

    private String country;

    private LocalDateTime createTime;

    private Address address;
}
