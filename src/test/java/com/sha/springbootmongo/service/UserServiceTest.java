package com.sha.springbootmongo.service;

import com.sha.springbootmongo.dto.UserDto;
import com.sha.springbootmongo.model.User;
import com.sha.springbootmongo.repository.IUserRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

/**
 * @author sa
 * @date 1/10/21
 * @time 2:40 PM
 */
@SpringBootTest(properties = "spring.profiles.active:test")
@ActiveProfiles("test")
@ExtendWith(SpringExtension.class)
public class UserServiceTest
{
    @Autowired
    private IUserService userService;

    @Autowired
    private IUserRepository userRepository;

    @Test
    public void test_saveUser()
    {
        UserDto userDto = UserDto.builder()
                .country("US")
                .name("test-user")
                .username("test-un")
                .build();

        userService.saveUser(userDto.convertToUser());

        List<User> users = userRepository.findAll();

        Assertions.assertThat(users).hasSize(1);
    }
}
