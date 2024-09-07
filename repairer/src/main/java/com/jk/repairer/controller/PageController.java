package com.jk.repairer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/service")
    public String service() {
        return "service";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/electrician")
    public String electrician() {
        return "electrician";
    }

    @GetMapping("/technician")
    public String technician() {
        return "technician";
    }

    @GetMapping("/plumber")
    public String plumber() {
        return "plumber";
    }

    @GetMapping("/mason")
    public String mason() {
        return "mason";
    }

    @GetMapping("/painter")
    public String painter() {
        return "painter";
    }

    @GetMapping("/carpenter")
    public String carpenter() {
        return "carpenter";
    }
    @GetMapping("/work")
    public String work(){
        return "work";
    }

    @GetMapping("/joinus")
    public String join(){
        return "join";
    }

    @GetMapping("/reqcallvisit")
    public String reqcallvisit(){
        return "reqcallvisit";
    }

}






