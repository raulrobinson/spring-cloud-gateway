package com.rasysbox.locationservice.application;

import com.rasysbox.ws.domain.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerUseCase {
    private final CustomerRepository customerRepository;

    public CustomerUseCase(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

}
