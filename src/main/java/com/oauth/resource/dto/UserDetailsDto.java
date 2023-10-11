package com.oauth.resource.dto;

import com.oauth.resource.modal.user.Gender;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Data
public class UserDetailsDto {

    private String contact;
    private String address1;
    private String address2;
    private int zipcode;
    private String state;
    private String city;
    private String country;
    private Gender gender;
    private Date dob;
}
