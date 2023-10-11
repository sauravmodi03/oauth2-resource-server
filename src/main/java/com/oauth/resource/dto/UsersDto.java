package com.oauth.resource.dto;

import com.oauth.resource.modal.UsersEntity;
import lombok.Getter;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
@Getter
public class UsersDto implements Serializable {

    private String firstName;
    private String lastName;
    private String email;
    private String contact;
    private String address1;
    private String address2;
    private int zipcode;
    private String city;
    private String country;

}
