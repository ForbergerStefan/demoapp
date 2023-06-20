package com.example.demo.service;


import com.example.demo.model.Event;
import com.example.demo.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DBService {
    @Autowired
    private EventRepository eventRepository;

    public void addEventToDB(Event event){
        if (event!=null) {
            eventRepository.save(event);
        }    }
    public Event getEventBasedOnPlace(String place){
        return eventRepository.findByplace(place);
    }
    public List<Event> getAllEvents(){
       return eventRepository.findAll();
    }
}
