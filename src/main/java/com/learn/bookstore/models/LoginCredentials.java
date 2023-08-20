package com.learn.bookstore.models;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class LoginCredentials {

    private String email;
    private String password;

}