package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/customers-service")
public class CustomerController {

    @GetMapping
    public String getCustomers() {
        return "Holiiii desde Customers Service!";
    }

}
