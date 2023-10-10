package com.example.coursjava.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name="For_profiles")
@Data
public class Profile {
    @Id
    @GeneratedValue
    long id;
    String nom;
    @ElementCollection
    String[] prenom;

    LocalDate date;

    @Embedded
    Adresse adresse;

    @OneToOne(mappedBy = "profile" , fetch = FetchType.LAZY)
    User user;
    int getPrenomSize() {
        return prenom.length;
    }
}

