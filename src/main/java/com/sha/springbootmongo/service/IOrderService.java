package com.sha.springbootmongo.service;

import com.sha.springbootmongo.model.Order;

import java.util.List;

/**
 * @author sa
 * @date 1/10/21
 * @time 12:20 PM
 */
public interface IOrderService
{
    void saveOrder(Order order);

    List<Order> ordersOfUser(String userId);
}
