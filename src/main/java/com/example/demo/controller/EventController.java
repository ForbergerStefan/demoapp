package com.example.demo.controller;

import com.example.demo.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ibm")

public class EventController {
        @Autowired
        private Service service;

        @GetMapping("/")
        public String getInitialPage(Model model){
                model.addAttribute("eventList", service.getEventList());
                return "events";
        }


}
