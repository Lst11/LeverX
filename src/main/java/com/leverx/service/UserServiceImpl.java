package com.leverx.service;

import com.leverx.entity.User;
import com.leverx.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

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
        Optional<User> user= repository.findById(id);
        user.orElseThrow(NoSuchElementException::new);
        return user.get();
    }

    @Override
    public User save(User user) {
        user.setCreateAt(LocalDateTime.now());
        return repository.saveAndFlush(user);
    }

    @Override
    public void remove(int id) {
        repository.deleteById(id);
    }
}