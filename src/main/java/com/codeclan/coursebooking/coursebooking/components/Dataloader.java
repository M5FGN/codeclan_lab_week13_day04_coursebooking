package com.codeclan.coursebooking.coursebooking.components;

import com.codeclan.coursebooking.coursebooking.models.Booking;
import com.codeclan.coursebooking.coursebooking.models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Dataloader implements ApplicationRunner {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRespository courseRespository;


    public Dataloader() {
    }

    public void run(ApplicationArguments args) {

        Customer mary = new Customer("Mary", "Glasgow", 42);
        customerRepository.save(mary);

        Customer katie = new Customer(("Katie", "Aberdeen", 40));
        customerRepository.save(katie);

        Customer anna = new Customer(("Anna", "Glasgow", 40));
        customerRepository.save(anna);

    }
}
