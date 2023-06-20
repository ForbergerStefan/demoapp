package com.example.demo.controller;

import com.example.demo.model.Event;
import com.example.demo.service.DBService;
import com.example.demo.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/ibm")

public class EventController {
        @Autowired
        private Service service;

        @Autowired
        private DBService dbService;

        @GetMapping("/")
        public String getInitialPage(Model model){
                model.addAttribute("partyEvent", new Event());
                model.addAttribute("eventList", service.getEventList());
                return "events";
        }
        @PostMapping("/")
        public String addEvent(Model model, @ModelAttribute Event event){
                service.addEventToList(event);
                dbService.addEventToDB(event);
                return "redirect:/ibm/";
        }

        @PostMapping("/findPlace")
        public String findPlace(Model model, @RequestParam String place){
                model.addAttribute("eventInPlace", dbService.getEventBasedOnPlace(place));
                model.addAttribute("EventList", service.getEventList());
                return "events";
        }

}
