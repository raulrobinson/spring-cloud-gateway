package com.rasysbox.locationservice.application.usecase;

import com.rasysbox.locationservice.application.dto.ResponseDto;
import com.rasysbox.locationservice.domain.repository.LocationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationUseCases {
    private final LocationRepository repository;

    public LocationUseCases(LocationRepository repository) {
        this.repository = repository;
    }

    public List<ResponseDto> findByRegionContaining(String region) {
        return repository.findByRegionContaining(region);
    }

}
