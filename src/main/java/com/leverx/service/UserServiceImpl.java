package com.leverx.service;

import com.leverx.entity.User;
import com.leverx.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository repository;

    @Override
    public List<User> getAll() {
        return repository.findAll();
    }

    @Override
    public User getById(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public User save(User user) {
        return repository.saveAndFlush(user);
    }

    @Override
    public void remove(int id) {
        repository.deleteById(id);
    }
}
