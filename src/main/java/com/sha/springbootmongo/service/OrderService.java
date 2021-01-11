package com.sha.springbootmongo.service;

import com.sha.springbootmongo.model.Order;
import com.sha.springbootmongo.repository.IOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author sa
 * @date 1/10/21
 * @time 12:20 PM
 */
@Service
public class OrderService implements IOrderService
{
    @Autowired
    private IOrderRepository orderRepository;

    @Override
    public void saveOrder(Order order)
    {
        orderRepository.save(order);
    }

    @Override
    public List<Order> ordersOfUser(String userId)
    {
        return orderRepository.findByUserId(userId);
    }
}
