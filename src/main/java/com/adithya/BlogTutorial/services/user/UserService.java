package com.adithya.BlogTutorial.services.user;

import com.adithya.BlogTutorial.payloads.UserDto;

import java.util.List;

public interface UserService {

    UserDto createUser(UserDto userDto);

    UserDto updateUser(UserDto userDto, Integer userId);

    UserDto getUserById(Integer userId);

    void deleteUser(Integer userId);

    List<UserDto> getAllUsers();
}
