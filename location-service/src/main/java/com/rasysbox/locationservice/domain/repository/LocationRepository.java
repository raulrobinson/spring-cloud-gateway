package com.rasysbox.locationservice.domain.repository;

import com.rasysbox.locationservice.application.dto.ResponseDto;

import java.util.List;

public interface LocationRepository {
    List<ResponseDto> findByRegionContaining(String region);
}
