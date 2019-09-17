package com.leverx.repository;

import com.leverx.entity.User;
import com.leverx.entity.comparators.UserComparator;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    default List<User> getTop() {
        List<User> users = this.findAll();
        List<User> topChart = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Optional<User> topUser = users.stream().max(new UserComparator());
            topUser.ifPresent(user -> {
                users.remove(user);
                topChart.add(user);
            });
        }
        return topChart;
    }
}