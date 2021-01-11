package com.sha.springbootmongo.service;

import com.sha.springbootmongo.model.User;
import com.sha.springbootmongo.projection.CountryAggregation;
import com.sha.springbootmongo.projection.UserAggregation;

import java.util.List;

/**
 * @author sa
 * @date 1/10/21
 * @time 12:14 PM
 */
public interface IUserService
{
    void saveUser(User user);

    List<User> findUsersByCountry(String country);

    List<UserAggregation> groupByCountry();

    List<CountryAggregation> countByCountry();
}
