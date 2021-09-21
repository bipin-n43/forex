package com.microservice.forex.repository;

import com.microservice.forex.entity.ExchangeValue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue , Long> {
    ExchangeValue findByFromAndTo(String from, String to);
}
