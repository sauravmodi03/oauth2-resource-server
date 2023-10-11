package com.oauth.resource.modal.user;


import com.oauth.resource.dto.UserDetailsDto;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name = "userdetails")
@NoArgsConstructor
public class UserDetails implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="gender")
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(name = "dob")
    @Temporal(TemporalType.DATE)
    private Date dob;

    @Column(name = "contact")
    private String contact;

    @Column(name = "address1")
    private String addressLine1;

    @Column( name = "address2")
    private String addressLine2;

    @Column( name = "zipcode")
    private int zipcode;

    @Column(name = "state")
    private String state;

    @Column(name = "city")
    private String city;

    @Column(name = "contry")
    private String country;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    @JoinColumn(name = "user_email", referencedColumnName = "email")
    private User user;


    public UserDetails(UserDetailsDto dto) {
        gender = dto.getGender();
        contact = dto.getContact();
        addressLine1 = dto.getAddress1();
        addressLine2 = dto.getAddress2();
        zipcode = dto.getZipcode();
        state = dto.getState();
        city = dto.getCity();
        country = dto.getCountry();
        dob = dto.getDob();
    }

}
