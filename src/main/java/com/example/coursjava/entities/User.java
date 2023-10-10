package com.example.coursjava.entities;
import jakarta.persistence.*;
import lombok.Data;

import static jakarta.persistence.GenerationType.*;

@Entity
@Table(name="For_User")
@Data
public class User {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    @Column(name = "username", unique = true, nullable = false, length = 50)
    String username;
    @Column(name = "password", nullable = false, length = 100)
    String password;

    @OneToOne
    Profile profile;

}