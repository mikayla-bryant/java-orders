package com.example.orders.services;

import com.example.orders.models.Customer;

import java.util.List;

public interface CustomerService
{
    List<Customer> findAllOrders();
    Customer save(Customer customer);
}
