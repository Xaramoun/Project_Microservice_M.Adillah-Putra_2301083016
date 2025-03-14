package com.teknologiinformasi.restapi.order.repository;

import com.teknologiinformasi.restapi.order.model.OrderSummary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderSummaryRepository extends JpaRepository<OrderSummary, String> {
}