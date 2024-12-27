package com.rasysbox.locationservice.domain.repository;

import com.rasysbox.ws.domain.dto.ResponseDTO;

import java.util.List;

public interface LocationRepository {
    List<ResponseDTO> findByRegionContaining(String region);
}
