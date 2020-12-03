package com.tomaskadlcek.MyWebsite.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProjectsController {


    @RequestMapping("/projects")
    public String getWithIndex(){
        return "projects";
    }
}
