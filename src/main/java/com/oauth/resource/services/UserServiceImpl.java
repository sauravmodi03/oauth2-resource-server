package com.oauth.resource.services;


import com.oauth.resource.dto.UserDto;
import com.oauth.resource.modal.user.User;
import com.oauth.resource.modal.user.UserDetails;
import com.oauth.resource.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserServiceImpl implements UserService {


    @Autowired
    private UserRepository userRepository;

    /**
     * @param email
     * @return
     */


    @Override
    public User getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    /**
     * @param username
     * @return
     */
    @Override
    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    /**
     * @param user
     */
    @Override
    public void registerCustomer(UserDto user) {
        userRepository.save(new User(user));
    }

    /**
     * @return
     */
    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

}
