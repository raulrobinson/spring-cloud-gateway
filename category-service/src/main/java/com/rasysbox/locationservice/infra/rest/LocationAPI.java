package com.rasysbox.locationservice.infra.rest;

import com.rasysbox.ws.application.LocationUseCase;
import com.rasysbox.ws.domain.dto.ResponseDTO;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "${controller.properties.base-path}/locations", produces = MediaType.APPLICATION_JSON_VALUE)
public class LocationAPI {
    private final LocationUseCase service;

    public LocationAPI(LocationUseCase service) {
        this.service = service;
    }

    @GetMapping("/{region}")
    public ResponseEntity<List<ResponseDTO>> findByRegionContaining(@PathVariable String region) {
        return ResponseEntity.ok(service.findByRegionContaining(region));
    }

}
