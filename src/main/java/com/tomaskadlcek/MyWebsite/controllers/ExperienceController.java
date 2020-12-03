package com.tomaskadlcek.MyWebsite.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExperienceController {

    @RequestMapping("/experience")
    public String getExperience(){
        return "experience";
    }
}
