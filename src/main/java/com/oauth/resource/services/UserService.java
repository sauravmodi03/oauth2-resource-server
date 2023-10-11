package com.oauth.resource.services;


import com.oauth.resource.dto.UserDto;
import com.oauth.resource.modal.user.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    User getUserByEmail(String email);

    User getUserByUsername(String username);

    void registerUser(UserDto user);

    List<User> findAll();

}
