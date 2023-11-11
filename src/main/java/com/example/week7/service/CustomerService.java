package com.example.week7.service;

import com.example.week7.entities.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    List<Customer> getAllCustomer();

    void saveCustomer(Customer customer);

    void deleteCustomer(Long id);

    Optional<Customer> findCustomerById(Long id);
}
