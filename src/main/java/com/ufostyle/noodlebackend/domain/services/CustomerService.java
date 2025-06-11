package com.ufostyle.noodlebackend.domain.services;

import com.ufostyle.noodlebackend.domain.models.Customer;
import com.ufostyle.noodlebackend.domain.repositories.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public ArrayList<Customer> findAllCustomer() {
        return (ArrayList<Customer>) customerRepository.findAll();
    }

    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public Optional<Customer> findByIdCustomer(UUID customerId) {
        return customerRepository.findById(customerId);
    }

    public Customer updateCustomer(UUID customerId, Customer customer) {
        return customerRepository.save(customer);
    }

    public void deleteByIdCustomer(UUID customerId) {
        customerRepository.deleteById(customerId);
    }
}
