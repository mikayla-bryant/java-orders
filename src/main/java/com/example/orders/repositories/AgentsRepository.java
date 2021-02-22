package com.example.orders.repositories;

import com.example.orders.models.Agent;
import org.springframework.data.repository.CrudRepository;

public interface AgentsRepository extends CrudRepository<Agent, Long> {
}
