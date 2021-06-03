package com.codeclan.coursebooking.coursebooking.components;

import com.codeclan.coursebooking.coursebooking.models.Booking;
import com.codeclan.coursebooking.coursebooking.models.Course;
import com.codeclan.coursebooking.coursebooking.models.CourseRatings;
import com.codeclan.coursebooking.coursebooking.models.Customer;
import com.codeclan.coursebooking.coursebooking.repositories.BookingRepository;
import com.codeclan.coursebooking.coursebooking.repositories.CourseRepository;
import com.codeclan.coursebooking.coursebooking.repositories.CustomerRepository;
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
    CourseRepository courseRespository;

    public Dataloader() {
    }

    public void run(ApplicationArguments args) {


        Customer mary = new Customer("Mary", "Glasgow", 42);
        customerRepository.save(mary);

        Customer katie = new Customer("Katie", "Aberdeen", 40);
        customerRepository.save(katie);

        Customer anna = new Customer("Anna", "Glasgow", 40);
        customerRepository.save(anna);

        Course course1 = new Course("Time keeping", "Aberdeen", CourseRatings.STARS4);
        courseRespository.save(course1);

        Course course2 = new Course("Run effective meetings", "Glasgow", CourseRatings.STARS5);
        courseRespository.save(course2);

        Course course3 = new Course("Supervisors toolkit", "Edinburgh", CourseRatings.STARS3);
        courseRespository.save(course3);

        Course course4 = new Course("Negotiate like a pro", "Edinburgh", CourseRatings.STARS2);
        courseRespository.save(course4);

        Course course5 = new Course("Win more bids", "Aberdeen", CourseRatings.STARS4);
        courseRespository.save(course5);

        Course course6 = new Course("Managing Up", "Glasgow", CourseRatings.STARS2);
        courseRespository.save(course6);

        Course course7 = new Course("Excel for beginners", "Glasgow", CourseRatings.STARS1);
        courseRespository.save(course7);

        Course course8 = new Course("Effective minute taking", "Edinburgh", CourseRatings.STARS3);
        courseRespository.save(course8);

        Course course9 = new Course("Write report that wow!", "Edinburgh", CourseRatings.STARS5);
        courseRespository.save(course9);

        Course course10 = new Course("Customer servuce excellence", "Glasgow", CourseRatings.STARS4);
        courseRespository.save(course10);

        Booking booking1 = new Booking("23-8-21", course1, mary);
        bookingRepository.save(booking1);

        Booking booking2 = new Booking("28-08-21", course2, katie);
        bookingRepository.save(booking2);

    }
}



