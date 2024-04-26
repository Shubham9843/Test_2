package com.temple.Vittheshwar.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.temple.Vittheshwar.Model.TempleEvent;
import com.temple.Vittheshwar.Respository.TempleEventRepository;

import java.util.List;

@Controller
public class TempleController {

    @Autowired
    private TempleEventRepository eventRepository;

    @RequestMapping("/homepage")
    public String home(Model model) {
        // Fetch events from the database
        List<TempleEvent> events = eventRepository.findAll();
        model.addAttribute("events", events);
        return "home";
    }
    
    @RequestMapping("/gallerypage")
    	public String showGallery() {
    	return "gallery";
    }
    @RequestMapping("/contactpage")
    public String showcontact() {
    	return "contactus";
    }
    @RequestMapping("/aboutpage")
    public String showAboutus() {
    	return "about";
    }
    @RequestMapping("/eventpage")
    public String showEvent() {
    	return "event";
    }
    @RequestMapping("/abhangpage")
    public String showAbhang() {
    	return "abhang";
    }
}

