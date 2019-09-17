package com.leverx.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "comment")
@Data
@NoArgsConstructor
public class Comment {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "message", length = 45, nullable = false)
    private String message;

    @Column(name = "post_id", nullable = false)
    private int postId;

    @Column(name = "authorId")
    private int authorId;

    @Column(name = "create_at", nullable = false)
    private LocalDateTime createAt;

    @Column(name = "approved", nullable = false)
    private Boolean approved = false;
}