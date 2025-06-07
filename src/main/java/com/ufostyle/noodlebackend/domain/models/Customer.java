package com.ufostyle.noodlebackend.domain.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue
    @JsonProperty("customer_id")
    @Column(name = "customer_id", columnDefinition = "uuid", updatable = false, nullable = false)
    private UUID customerId;

    @JsonProperty("names")
    @Column(name = "customer_name", length = 40, nullable = false)
    private String names;

    @JsonProperty("first_surname")
    @Column(name = "first_surname", length = 20, nullable = false)
    private String firstSurName;

    @JsonProperty("second_last_name")
    @Column(name = "second_lastname", length = 20, nullable = false)
    private String secondLastName;

    @JsonProperty("customer_dni")
    @Column(name = "dni", nullable = false)
    private Integer dni;

    @JsonProperty("birth_date")
    @Column(name = "birth_date", nullable = false)
    private Date birthdate;

    @JsonProperty("cell_phone_number")
    @Column(name = "cell_phone_number", nullable = false)
    private Integer cellPhoneNumber;

    @JsonProperty("gender_type")
    @Column(name = "gender_type", length = 9, nullable = false)
    private String genderType;

    @JsonProperty("customer_email")
    @Column(name = "customer_email", length = 35, nullable = false)
    private String email;
}
