package com.ufostyle.noodlebackend.domain.models;

import lombok.Data;

import java.util.Date;

@Data
public class Customer {

    private String customerId;
    private String names;
    private String firstSurName;
    private String secondLastName;
    private Integer dni;
    private Date birthdate;
    private Integer cellPhoneNumber;
    private String genderType;
    private String email;
}
