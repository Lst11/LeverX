package com.leverx.service;

import com.leverx.entity.User;

import java.util.List;

public interface UserService {

    User save(User user);

    void remove(int id);

    List<User> getAll();

    User getById(int id);

    List<User> getTopUsers();
}
