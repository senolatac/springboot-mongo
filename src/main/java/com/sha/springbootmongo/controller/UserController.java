package com.sha.springbootmongo.controller;

import com.sha.springbootmongo.dto.UserDto;
import com.sha.springbootmongo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author sa
 * @date 1/10/21
 * @time 12:48 PM
 */
@RestController
@RequestMapping("api/user")//pre-path
public class UserController
{
    @Autowired
    private IUserService userService;

    @PostMapping
    public ResponseEntity<?> saveUser(@RequestBody UserDto userDto)
    {
        userService.saveUser(userDto.convertToUser());
        return ResponseEntity.ok(true);
    }

    @GetMapping("country/{country}")
    public ResponseEntity<?> findByCountry(@PathVariable String country)
    {
        return ResponseEntity.ok(userService.findUsersByCountry(country));
    }

    @GetMapping("count-by-country")
    public ResponseEntity<?> countByCountry()
    {
        return ResponseEntity.ok(userService.countByCountry());
    }

    @GetMapping("group-by-country")
    public ResponseEntity<?> groupByCountry()
    {
        return ResponseEntity.ok(userService.groupByCountry());
    }
}
