package com.leverx.entity;

import com.leverx.entity.enums.Role;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "user")
@Data
@NoArgsConstructor
@ToString(exclude = "games")
public class User {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private Integer id;


    @Column(name = "name", length = 45, nullable = false)
    private String name;

    @Column(name = "surname", length = 45)
    private String surname;

    @Column(name = "password", length = 30, nullable = false)
    private String password;

    @Column(name = "email", length = 60, nullable = false)
    private String email;

    @Column(name = "create_at", nullable = false)
    private Date createAt;

    @Column(name = "role", nullable = false)
    private Role role;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "author_id")
    @Type(type = "org.hibernate.type.settype")
    private Set<Game> games = new HashSet<Game>();
}