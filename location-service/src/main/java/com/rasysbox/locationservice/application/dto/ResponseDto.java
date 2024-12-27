package com.rasysbox.locationservice.application.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDto {
    @JsonProperty("region")
    private String region;

    @JsonProperty("department_dane_code")
    private Long codigoDaneDelDepartamento;

    @JsonProperty("department")
    private String departamento;

    @JsonProperty("municipality_dane_code")
    private Long codigoDaneDelMunicipio;

    @JsonProperty("municipality")
    private String municipio;
}
