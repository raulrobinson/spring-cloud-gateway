package com.rasysbox.locationservice.infra.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Builder
@Getter
@Setter
@Entity(name = "Category")
@NoArgsConstructor
@AllArgsConstructor
public class CategoryEntity {
    @Id
    private String id;
    private String name;
}
