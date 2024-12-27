package com.rasysbox.locationservice.domain.model;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Location {
    private String region;
    private Long codigoDaneDelDepartamento;
    private String departamento;
    private Long codigoDaneDelMunicipio;
    private String municipio;
}
