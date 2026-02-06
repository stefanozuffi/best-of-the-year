package org.lessons.java.ex.best_of_the_year.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home";
    }
    
    @GetMapping("/welcome")
    public String getWelcome(@RequestParam(name = "name") String name, Model model) {
        
        model.addAttribute("name", name);
        
        return "welcome";
    }
    
}