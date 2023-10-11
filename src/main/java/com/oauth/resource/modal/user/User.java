package com.oauth.resource.modal.user;

import com.oauth.resource.dto.UserDto;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "firstname")
    private String firstName;

    @Column(name="lastname")
    private String lastLame;

    @Column(name = "email")
    private String email;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @OneToOne(mappedBy = "user")
    private UserDetails userDetails;

    public User(UserDto dto) {
        firstName = dto.getFirstName();
        lastLame = dto.getLastName();
        email = dto.getEmail();
        username = dto.getUsername();
        password = dto.getPassword();
        userDetails = new UserDetails(dto.getUserDetailsDto());
    }

}
