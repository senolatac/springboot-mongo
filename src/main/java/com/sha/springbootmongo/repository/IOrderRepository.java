package com.sha.springbootmongo.repository;

import com.sha.springbootmongo.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * @author sa
 * @date 1/10/21
 * @time 12:10 PM
 */
public interface IOrderRepository extends MongoRepository<Order, String>
{
    List<Order> findByUserId(String userId);
}
