package com.adithya.BlogTutorial.payloads;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.validation.constraints.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDto {


    private Integer id;

    @NotEmpty //Checks not null and blank
    @Size(min = 4, message = "Username should be longer than 4 characters")
    private String name;

    @Email(message = "Email address is not valid")
    private String email;

    @NotEmpty
    @Size(min = 4, max = 20, message = "Password must be min 4 and max 20 characters")
//    @Pattern(regexp = ) Can be used to check regex
    private String password;

    @NotEmpty
    @Size(min = 10, message = "About section should be longer than 10 characters")
    private String about;
}
