package com.leverx.controller;

import com.leverx.entity.User;
import com.leverx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping
    @ResponseBody
    public List<User> getAllUsers() {
        return service.getAll();
    }

    /**
     * Correct Request example (with required parameters):
     * {"name":"some name",
     * "surname":"some surname",
     * "email":"aaa@bb.com",
     * "password":"1234",
     * "role" :"ADMINISTRATOR"}
     */
    @PostMapping
    @ResponseBody
    public User saveUser(@RequestBody User user) {
        return service.save(user);
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public User getUser(@PathVariable("id") int userId) {
        return service.getById(userId);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void delete(@PathVariable("id") int userId) {
        service.remove(userId);
    }

    @RequestMapping(value = "/top", method = RequestMethod.GET)
    @ResponseBody
    public List<User> getUser() {
        return service.getTopUsers();
    }
}