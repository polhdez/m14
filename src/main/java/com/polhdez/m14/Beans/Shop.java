package com.polhdez.m14.Beans;

import javax.persistence.*;

@Entity
@Table(name="shops")
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    int capacity;
    private String name;

    public Shop() {}

    public Shop(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public long getId() {
        return this.id;
    }

    public String getName()  {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setCapacity(int capacity)  {
        this.capacity = capacity;
    }
}