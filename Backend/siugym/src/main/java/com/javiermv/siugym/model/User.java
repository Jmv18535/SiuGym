package com.javiermv.siugym.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "users")
public class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    Long id;
    String name;
    String surname;
    String email;
    String password;
    LocalDate birthDate;
    String gender;
    Double height;
    Double weight;

}
