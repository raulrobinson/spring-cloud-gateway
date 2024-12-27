package com.rasysbox.locationservice.application;

import com.rasysbox.ws.domain.repository.OrderRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderUserCase {
    private final OrderRepository orderRepository;

    public OrderUserCase(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

}
