package com.example.coursjava.entities;

import jakarta.persistence.Embeddable;
import lombok.Data;
@Embeddable
@Data
public class Adresse {

    String  rue;
    String ville;
    String pays;
    long code;

}
