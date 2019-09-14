package com.leverx.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "comment")
@Data
@NoArgsConstructor
public class Comment {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private int id;

    @Column(name = "message", length = 45)
    private String message;

    @ManyToOne(targetEntity = com.leverx.entity.User.class)
    @JoinColumn(name = "id_user", nullable = false)
    private int postId;

    @Column(name = "authorId", nullable = false)
    private int authorId;

    @Column(name = "create_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createAt;

    @Column(name = "approved", nullable = false)
    private Boolean approved;
}
