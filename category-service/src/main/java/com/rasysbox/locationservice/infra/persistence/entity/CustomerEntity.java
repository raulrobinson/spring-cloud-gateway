package com.rasysbox.locationservice.infra.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Builder
@Getter
@Setter
@Entity(name = "Customer")
@NoArgsConstructor
@AllArgsConstructor
public class CustomerEntity {
    @Id
    private String id;
    private String name;
    private String country;
}
