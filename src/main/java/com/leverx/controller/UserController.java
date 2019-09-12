package com.leverx.controller;

import com.leverx.entity.User;
import com.leverx.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository repository;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public User gerUser() {
        List<User> list = repository.findAll();
        return createMockRemind();
    }

    private User createMockRemind() {
        User user = new User();
        user.setId(1);
        user.setName("Super name");
        return user;
    }
}
