package com.leverx.repository;

import com.leverx.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Integer> {

    @Query("select comment from Comment comment where comment.postId = :userId")
    List<Comment> getByPostId(@Param("userId") int userId);
}