package com.oauth.resource.services;


import com.oauth.resource.dto.UsersDto;
import com.oauth.resource.modal.UsersEntity;
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
    public UsersEntity getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    /**
     * @param user
     */
    @Override
    public void registerCustomer(UsersDto user) {
        userRepository.save(new UsersEntity(user));
    }

    /**
     * @return
     */
    @Override
    public List<UsersEntity> findAll() {
        return userRepository.findAll();
    }
}
