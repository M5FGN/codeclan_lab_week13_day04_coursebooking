package com.codeclan.coursebooking.coursebooking.repositories;

import com.codeclan.coursebooking.coursebooking.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
