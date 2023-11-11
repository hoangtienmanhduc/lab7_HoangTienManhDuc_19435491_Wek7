package com.example.week7.controllers;

import com.example.week7.entities.Customer;
import com.example.week7.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @RequestMapping("/")
    public String save(Customer customer) {
        Customer customer1 = new Customer("duc", "duc@gmail.com", "123456789", "thong nhat");
        customerService.saveCustomer(customer1);
        return "index";
    }
}
