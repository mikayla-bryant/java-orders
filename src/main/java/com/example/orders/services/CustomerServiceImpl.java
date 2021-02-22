package com.example.orders.services;

import com.example.orders.models.Customer;
import com.example.orders.repositories.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "customerService")
public class CustomerServiceImpl implements CustomerService
{
    @Autowired
    CustomersRepository custrepos;

    @Override
    public Customer save(Customer customer)
    {
        return custrepos.save(customer);
    }
}
