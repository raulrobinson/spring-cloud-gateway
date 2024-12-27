package com.rasysbox.locationservice.infra.persistence.implementation;

import com.rasysbox.ws.domain.dto.ResponseDTO;
import com.rasysbox.ws.domain.model.Location;
import com.rasysbox.ws.domain.repository.LocationRepository;
import com.rasysbox.ws.infra.persistence.entity.LocationEntity;
import com.rasysbox.ws.infra.persistence.repository.LocationJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class LocationRepositoryImpl implements LocationRepository {

    private final LocationJpaRepository jpaRepository;

    @Autowired
    public LocationRepositoryImpl(LocationJpaRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    public List<ResponseDTO> findByRegionContaining(String region) {
        List<LocationEntity> entities = jpaRepository.findByRegionContaining(region);
        return entities.stream().map(this::mapToDomain).toList();
    }

    private LocationEntity mapToEntity(Location location) {
        LocationEntity entity = new LocationEntity();
        entity.setRegion(location.getRegion());
        entity.setDepartamento(location.getDepartamento());
        entity.setMunicipio(location.getMunicipio());
        entity.setCodigoDaneDelDepartamento(location.getCodigoDaneDelDepartamento());
        entity.setCodigoDaneDelMunicipio(location.getCodigoDaneDelMunicipio());
        return entity;
    }

    private ResponseDTO mapToDomain(LocationEntity entity) {
        return ResponseDTO.builder()
                .region(entity.getRegion())
                .departamento(entity.getDepartamento())
                .municipio(entity.getMunicipio())
                .codigoDaneDelDepartamento(entity.getCodigoDaneDelDepartamento())
                .codigoDaneDelMunicipio(entity.getCodigoDaneDelMunicipio())
                .build();
    }
}