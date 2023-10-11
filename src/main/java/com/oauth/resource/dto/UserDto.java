package com.oauth.resource.dto;

import com.oauth.resource.modal.user.Gender;
import com.oauth.resource.modal.user.User;
import lombok.Data;
import lombok.Getter;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

@Component
@Data
public class UserDto implements Serializable {

    private String firstName;
    private String lastName;
    private String email;
    private String username;
    private String password;
    private UserDetailsDto userDetails;

}
