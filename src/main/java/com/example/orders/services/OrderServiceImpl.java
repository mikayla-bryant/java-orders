package com.example.orders.services;

import com.example.orders.models.Order;
import com.example.orders.repositories.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "orderService")
public class OrderServiceImpl implements OrderService
{
    @Autowired
    OrdersRepository ordersrepos;

    @Override
    public Order save(Order order)
    {
        return ordersrepos.save(order);
    }
}
