package com.dexter.controller;

import com.dexter.entity.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dexterl
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/{id}")
    public User view(@PathVariable("id") Long id){
        User user = new User();
        user.setId(id);
        user.setName("dexter");
        return user;
    }
}
