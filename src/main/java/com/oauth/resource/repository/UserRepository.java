package com.oauth.resource.repository;


import com.oauth.resource.entity.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserRepository extends JpaRepository<UsersEntity, Long> {

    UsersEntity findByEmail(String email);

}
