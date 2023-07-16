package com.geekster.Instagram.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {

    private String firstName;

    private String lastName;

    private Integer age;

    private String email;

    private String phoneNumber;
}
