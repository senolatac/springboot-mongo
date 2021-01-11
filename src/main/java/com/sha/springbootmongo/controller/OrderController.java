package com.sha.springbootmongo.controller;

import com.sha.springbootmongo.dto.OrderDto;
import com.sha.springbootmongo.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author sa
 * @date 1/10/21
 * @time 2:07 PM
 */
@RestController
@RequestMapping("api/order")//pre-path
public class OrderController
{
    @Autowired
    private IOrderService orderService;

    @PostMapping
    public ResponseEntity<?> saveOrder(@RequestBody OrderDto orderDto)
    {
        orderService.saveOrder(orderDto.convertToOrder());
        return ResponseEntity.ok(true);
    }

    @GetMapping("{userId}")
    public ResponseEntity<?> getOrdersOfUser(@PathVariable String userId)
    {
        return ResponseEntity.ok(orderService.ordersOfUser(userId));
    }
}
