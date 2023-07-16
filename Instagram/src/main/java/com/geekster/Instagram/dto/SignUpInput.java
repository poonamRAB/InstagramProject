package com.geekster.Instagram.dto;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class SignUpInput {

    private String firstName;

    private String lastName;

    private Integer age;

    private String phoneNumber;

    private String emailId;

    private String password;
}
