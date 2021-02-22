package com.example.orders.services;

import com.example.orders.models.Agent;
import com.example.orders.repositories.AgentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "agentService")
public class AgentServiceImpl implements AgentService
{
    @Autowired
    AgentsRepository agentrepos;

    @Override
    public Agent save(Agent agent)
    {
        return agentrepos.save(agent);
    }
}
