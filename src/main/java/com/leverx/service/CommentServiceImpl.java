package com.leverx.service;

import com.leverx.entity.Comment;
import com.leverx.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    CommentRepository repository;

    @Override
    public List<Comment> getAll() {
        return repository.findAll();
    }

    @Override
    public List<Comment> getByPostId(int postId) {
        return null;
    }

    @Override
    public Comment save(Comment comment) {
        return repository.saveAndFlush(comment);
    }
}