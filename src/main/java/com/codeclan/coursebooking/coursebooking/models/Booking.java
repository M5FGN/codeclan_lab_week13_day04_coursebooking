package com.codeclan.coursebooking.coursebooking.models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name="Bookings")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="bookingid")
    private Long id;

    @Column(name="date")
    private String date;

    @JsonBackReference({"bookinga"})
    @ManyToOne()
    @JoinTable(

    )
    public Booking(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
