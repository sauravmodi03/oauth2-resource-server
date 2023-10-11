package com.oauth.resource.modal;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.oauth.resource.dto.UsersDto;
import com.oauth.resource.utility.Mapper;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Entity
@Table(name = "users")
@NoArgsConstructor
public class UsersEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "firstname")
    private String firstName;

    @Column(name="lastname")
    private String lastLame;

    @Column(name = "email")
    private String email;

    @Column(name = "contact")
    private String contact;

    @Column(name = "address1")
    private String addressLine1;

    @Column( name = "address2")
    private String addressLine2;

    @Column( name = "zipcode")
    private int zipcode;

    @Column(name = "city")
    private String city;

    @Column(name = "contry")
    private String country;

    public UsersEntity(UsersDto usersDto) {
        firstName = usersDto.getFirstName();
        lastLame = usersDto.getLastName();
        email = usersDto.getEmail();
        contact = usersDto.getContact();
        addressLine1 = usersDto.getAddress1();
        addressLine2 = usersDto.getAddress2();
        zipcode = usersDto.getZipcode();
        city = usersDto.getCity();
        country = usersDto.getCountry();
    }

    public String toString(){
        try {
            return Mapper.mapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

}
