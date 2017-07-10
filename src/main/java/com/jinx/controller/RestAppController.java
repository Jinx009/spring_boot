package com.jinx.controller;

import com.jinx.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jinx on 7/10/17.
 */
@RestController
@RequestMapping(value = "/rest")
public class RestAppController {

    @RequestMapping(value = "/data")
    public User data(){
        User user = new User();
        user.setName("Jinx");
        user.setId(1);
        user.setPassword("test");
        return user;
    }

}
