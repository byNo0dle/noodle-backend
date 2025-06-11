package com.ufostyle.noodlebackend.infrastructure.controllers;

import com.ufostyle.noodlebackend.domain.models.Customer;
import com.ufostyle.noodlebackend.domain.services.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/noodle/customers")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public ArrayList<Customer> findAllCustomer() {
        return customerService.findAllCustomer();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Customer saveCustomer(@RequestBody Customer customer) {
        return customerService.saveCustomer(customer);
    }

    @GetMapping("/{customerId}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Customer> findByIdCustomer(@PathVariable("customerId") UUID customerId) {
        return customerService.findByIdCustomer(customerId);
    }

    @PutMapping("/{customerId}")
    @ResponseStatus(HttpStatus.OK)
    public Customer updateCustomer(@PathVariable("customerId") UUID customerId, @RequestBody Customer customer) {
        return customerService.updateCustomer(customerId, customer);
    }

    @DeleteMapping("/{customerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteByIdCustomer(@PathVariable("customerId") UUID customerId) {
        customerService.deleteByIdCustomer(customerId);
    }
}
