package com.rasysbox.locationservice.infra.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.math.BigDecimal;

@Builder
@Getter
@Setter
@Entity(name = "Orders")
@NoArgsConstructor
@AllArgsConstructor
public class OrderEntity {
    @Id
    private String id;
    private String customerId;
    private BigDecimal total;
}
