package com.leverx.controller;

import com.leverx.entity.Book;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/users")
public class UserController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public Book gerUser() {
        return createMockRemind();
    }

    private Book createMockRemind() {
        Book book = new Book();
        book.setId(1);
        book.setName("Super name");
        return book;
    }
}
