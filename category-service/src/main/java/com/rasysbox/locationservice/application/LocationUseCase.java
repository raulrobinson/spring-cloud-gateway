package com.rasysbox.locationservice.application;

import com.rasysbox.ws.domain.dto.ResponseDTO;
import com.rasysbox.ws.domain.repository.LocationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationUseCase {
    private final LocationRepository repository;

    public LocationUseCase(LocationRepository repository) {
        this.repository = repository;
    }

    public List<ResponseDTO> findByRegionContaining(String region) {
        return repository.findByRegionContaining(region);
    }

}
