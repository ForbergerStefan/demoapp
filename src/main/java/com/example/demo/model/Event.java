package com.example.demo.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "event")

public class Event {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private int id;

    @Column(name = "place")
    private String place;

    @Column(name = "count")
    private int  count;
    @Column(name = "maxPeople")
    private int maxPeople;

    @ManyToMany(mappedBy = "eventSet")
    private Set<Users> usersSet = new HashSet<>();


    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
            this.count = count;
        }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }



    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", place='" + place + '\'' +
                ", count=" + count +
                ", maxPeople=" + maxPeople +
                '}';
    }
}

