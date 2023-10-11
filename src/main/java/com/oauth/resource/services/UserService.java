package com.oauth.resource.services;


import com.oauth.resource.dto.UsersDto;
import com.oauth.resource.modal.UsersEntity;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    UsersEntity getUserByEmail(String email);

    void registerCustomer(UsersDto user);

    Iterable<UsersEntity> findAll();
}
