package com.leverx.service;

import com.leverx.entity.Comment;

import java.util.List;

public interface CommentService {

    Comment save(Comment comment);

    List<Comment> getAll();

    List<Comment> getByPostId(int postId);
}