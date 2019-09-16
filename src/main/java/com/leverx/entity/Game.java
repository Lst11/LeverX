package com.leverx.entity;

import com.leverx.entity.enums.Status;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Proxy;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "game")
@Data
@NoArgsConstructor
@Proxy(lazy = false)
public class Game {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "title", length = 100, nullable = false)
    private String title;

    @Column(name = "status", nullable = false)
    private Status status;

    @Column(name = "author_id", nullable = false)
    private int author;

    @Column(name = "create_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "update_at")
    private LocalDateTime updatedAt;
}