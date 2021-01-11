package com.sha.springbootmongo.dto;

import com.sha.springbootmongo.model.Order;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @author sa
 * @date 1/10/21
 * @time 2:08 PM
 */
@Getter
@NoArgsConstructor
public class OrderDto
{
    private String name;
    private String userId;

    public Order convertToOrder()
    {
        return Order.builder()
                .orderName(name)
                .userId(userId)
                .orderTime(LocalDateTime.now())
                .build();
    }
}
