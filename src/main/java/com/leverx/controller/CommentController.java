package com.leverx.controller;

import com.leverx.entity.Comment;
import com.leverx.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/articles")
public class CommentController {

    @Autowired
    private CommentService service;

    @GetMapping
    @ResponseBody
    public List<Comment> getAll() {
        return service.getAll();
    }

    @PostMapping
    @ResponseBody
    public Comment saveComment(@RequestBody Comment comment) {
        return service.save(comment);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public List<Comment> getAllByPostId(@PathVariable("id") int userId) {
        return service.getByPostId(userId);
    }
}