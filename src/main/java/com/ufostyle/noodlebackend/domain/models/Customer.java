package com.ufostyle.noodlebackend.domain.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue
    @Column(name = "customer_id", columnDefinition = "uuid", updatable = false, nullable = false)
    private UUID customerId;
    @Column(name = "customer_name", length = 40, nullable = false)
    private String names;
    @Column(name = "first_surname", length = 20, nullable = false)
    private String firstSurName;
    @Column(name = "second_lastname", length = 20, nullable = false)
    private String secondLastName;
    @Column(name = "dni", nullable = false)
    private Integer dni;
    @Column(name = "birth_date", nullable = false)
    private Date birthdate;
    @Column(name = "cell_phone_number", nullable = false)
    private Integer cellPhoneNumber;
    @Column(name = "gender_type", length = 9)
    private String genderType;
    @Column(name = "customer_email", nullable = false)
    private String email;
}
