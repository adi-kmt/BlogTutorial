package com.adithya.BlogTutorial.payloads;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDto {


    private Integer id;

    private String name;
    private String email;
    private String password;
    private String about;
}
