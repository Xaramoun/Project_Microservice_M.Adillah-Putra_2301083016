package com.teknologiinformasi.restapi.customer.repository;

import com.teknologiinformasi.restapi.customer.model.Customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}