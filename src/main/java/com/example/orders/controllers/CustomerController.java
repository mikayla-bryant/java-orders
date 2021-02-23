package com.example.orders.controllers;

import com.example.orders.models.Customer;
import com.example.orders.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController
{
    @Autowired
    CustomerService customerService;
    //http://localhost:2023/customers/orders
    @GetMapping(value = "/orders", produces = "application/json")
    public ResponseEntity<?> listAllOrders()
    {
        List<Customer> myList = customerService.findAllOrders();
        return new ResponseEntity<>(myList, HttpStatus.OK);
    }
    //http://localhost:2019/customers/customer/id
    //http://localhost:2019/customers/namelike/{likename}
}
