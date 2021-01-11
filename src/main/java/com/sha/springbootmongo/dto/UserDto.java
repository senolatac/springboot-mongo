package com.sha.springbootmongo.dto;

import com.sha.springbootmongo.model.Address;
import com.sha.springbootmongo.model.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @author sa
 * @date 1/10/21
 * @time 12:49 PM
 */
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDto
{
    private String name;
    private String country;
    private String username;
    private AddressDto address;

    public User convertToUser()
    {
        return User.builder()
                .country(country)
                .createTime(LocalDateTime.now())
                .name(name)
                .username(username)
                .address(address == null ? null : address.convertToAddress())
                .build();
    }

}
