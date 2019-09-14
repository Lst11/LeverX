package com.leverx.entity;

import com.leverx.entity.enums.Role;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "user")
@NoArgsConstructor
@Data
public class User {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private int id;

    @Column(name = "name", length = 45)
    private String name;

    @Column(name = "surname", length = 45)
    private String surname;

    @Column(name = "password", length = 30)
    private String password;

    @Column(name = "email", length = 60)
    private String email;

    @Column(name = "date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date currentDate;

    @Column(name = "role")
    private Role role;
}