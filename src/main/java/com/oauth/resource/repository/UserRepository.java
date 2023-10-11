package com.oauth.resource.repository;


import com.oauth.resource.modal.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UsersEntity, Long> {

    UsersEntity findByEmail(String email);

}
