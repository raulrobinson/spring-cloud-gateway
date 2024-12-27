package com.rasysbox.locationservice.infra.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

//@Getter
//@Setter
//@ToString
//@Builder
//@AllArgsConstructor
//@RequiredArgsConstructor
@Data
@Entity
@Table(name = "Locations")
public class LocationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "region")
    private String region;

    @Column(name = "c_digo_dane_del_departamento")
    private Long codigoDaneDelDepartamento;

    @Column(name = "departamento")
    private String departamento;

    @Column(name = "c_digo_dane_del_municipio")
    private Long codigoDaneDelMunicipio;

    @Column(name = "municipio")
    private String municipio;

}
