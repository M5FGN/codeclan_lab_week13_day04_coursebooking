package com.codeclan.coursebooking.coursebooking.models;

import javax.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="customerid")
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="town")
    private String town;

    @Column(name="age")
    private int age;

    @OneToMany
    @JoinColumn(name="bookingid", nullable = false)
    private Booking booking;

    public Customer(String name, String town, int age) {
        this.name = name;
        this.town = town;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
