package com.oauth.resource.services;


import com.oauth.resource.bcrypt.Encoder;
import com.oauth.resource.dto.UserDto;
import com.oauth.resource.modal.user.User;
import com.oauth.resource.modal.user.UserDetails;
import com.oauth.resource.repository.UserDetailsRepository;
import com.oauth.resource.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserServiceImpl implements UserService {


    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserDetailsRepository userDetailsRepository;

    /**
     * @param email
     * @return
     */


    @Override
    public User getUserByEmail(String email) {
        User user = userRepository.findByUsername(email);
        user.setPassword("#########");
        return user;
    }

    /**
     * @param username
     * @return
     */
    @Override
    public User getUserByUsername(String username) {
        User user = userRepository.findByUsername(username);
        user.setPassword("#########");
        return user;
    }

    /**
     * @param user
     */
    @Override
    public void registerUser(UserDto user) {
        Encoder enc = new Encoder();
        user.setPassword( enc.encoder().encode(user.getPassword()));
        userRepository.save(new User(user));
        userDetailsRepository.save(new UserDetails(user.getUserDetails()));
    }

    /**
     * @return
     */
    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    private void maskPassword(User user) {
        user.setPassword(user.getPassword().replaceAll("^[a-zA-Z0-9]+$", "#"));
    }

}
