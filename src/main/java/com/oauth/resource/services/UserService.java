package com.oauth.resource.services;


import com.oauth.resource.dto.UserDto;
import com.oauth.resource.modal.user.User;
import com.oauth.resource.modal.user.UserDetails;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    User getUserByEmail(String email);

    User getUserByUsername(String username);

    void registerCustomer(UserDto user);

    List<User> findAll();

}
