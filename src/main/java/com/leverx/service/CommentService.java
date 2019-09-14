package com.leverx.service;

import com.leverx.entity.Comment;
import com.leverx.entity.User;

import java.util.List;

public interface CommentService {

    List<Comment> getAll();

    List<Comment> getByPostId(int postId);

    Comment save(Comment comment);
}
