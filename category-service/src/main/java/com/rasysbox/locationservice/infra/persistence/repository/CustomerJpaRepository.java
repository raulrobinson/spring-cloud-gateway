package com.rasysbox.locationservice.infra.persistence.repository;

import com.rasysbox.ws.infra.persistence.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerJpaRepository extends JpaRepository<CustomerEntity, Long> {
}
