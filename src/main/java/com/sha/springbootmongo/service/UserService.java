package com.sha.springbootmongo.service;

import com.sha.springbootmongo.model.User;
import com.sha.springbootmongo.projection.CountryAggregation;
import com.sha.springbootmongo.projection.UserAggregation;
import com.sha.springbootmongo.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author sa
 * @date 1/10/21
 * @time 12:14 PM
 */
@Service
public class UserService implements IUserService
{
    @Autowired
    private IUserRepository userRepository;

    @Override
    public void saveUser(User user)
    {
        userRepository.save(user);
    }

    @Override
    public List<User> findUsersByCountry(String country)
    {
        return userRepository.findByCountryAsCustom(country);
    }

    @Override
    public List<UserAggregation> groupByCountry()
    {
        return userRepository.groupByCounty();
    }

    @Override
    public List<CountryAggregation> countByCountry()
    {
        return userRepository.countByCountry();
    }
}
