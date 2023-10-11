package com.oauth.resource.entity;


import com.oauth.resource.dto.UsersDto;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
public class UsersEntity {

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

}
