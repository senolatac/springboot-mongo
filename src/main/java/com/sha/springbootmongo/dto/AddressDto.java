package com.sha.springbootmongo.dto;

import com.sha.springbootmongo.model.Address;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author sa
 * @date 1/10/21
 * @time 12:50 PM
 */
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AddressDto
{
    private String city;
    private Integer postCode;

    public Address convertToAddress()
    {
        return Address.builder()
                .city(city)
                .postCode(postCode)
                .build();
    }
}
