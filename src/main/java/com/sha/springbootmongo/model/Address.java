package com.sha.springbootmongo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

/**
 * @author sa
 * @date 1/9/21
 * @time 10:34 PM
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Address
{
    private String city;
    private int postCode;
}
