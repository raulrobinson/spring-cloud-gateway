package com.rasysbox.locationservice.infra.persistence.repository;

import com.rasysbox.ws.infra.persistence.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderJpaRepository extends JpaRepository<OrderEntity, Long> {
}
