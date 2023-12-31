package com.example.demo.service;

import com.example.demo.model.Event;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
public class Service {

    private List<Event> eventList = new ArrayList<>();

    public Service(){
        Event event = new Event();
        event.setPlace("IBM Academy, Protifašistických bojovníkov 11, 04001, Košice");
        event.setCount(25);
        event.setMaxPeople(50);
        eventList.add(event);
    }

    public List<Event> getEventList() {
        return eventList;
    }

    public void setEventList(List<Event> eventList) {
        this.eventList = eventList;
    }

    public void addEventToList(Event event){
        eventList.add(event);
    }
}
