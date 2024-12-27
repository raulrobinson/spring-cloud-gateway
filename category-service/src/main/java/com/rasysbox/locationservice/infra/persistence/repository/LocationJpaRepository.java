package com.rasysbox.locationservice.infra.persistence.repository;

import com.rasysbox.ws.infra.persistence.entity.LocationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LocationJpaRepository extends JpaRepository<LocationEntity, Long> {
//    LocationEntity getLocationByRegion(String region);
//    LocationEntity getLocationByDepartamento(String departamento);
//    List<LocationEntity> findByMunicipioContaining(String municipio);
//    List<LocationEntity> findByDepartamentoContaining(String departamento);
    List<LocationEntity> findByRegionContaining(String region);
//    List<LocationEntity> findByCodigoDaneDelDepartamentoContaining(Long departmentCode);
//    List<LocationEntity> findByCodigoDaneDelMunicipioContaining(Long municipalityCode);
}
