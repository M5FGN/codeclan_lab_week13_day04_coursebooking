package com.codeclan.coursebooking.coursebooking.repositories;

import com.codeclan.coursebooking.coursebooking.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
