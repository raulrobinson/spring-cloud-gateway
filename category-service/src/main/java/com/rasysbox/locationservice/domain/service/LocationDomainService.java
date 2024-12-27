package com.rasysbox.locationservice.domain.service;

import com.rasysbox.ws.domain.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationDomainService {

    private final LocationRepository repository;

    @Autowired
    public LocationDomainService(LocationRepository repository) {
        this.repository = repository;
    }
}
