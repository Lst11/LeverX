package com.leverx.entity.comparators;

import com.leverx.entity.User;

import java.util.Comparator;

public class UserComparator implements Comparator<User> {

    @Override
    public int compare(User user1, User user2) {
        return user1.getRating() - user2.getRating();
    }
}