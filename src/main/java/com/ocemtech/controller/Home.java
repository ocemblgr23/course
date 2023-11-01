package com.ocemtech.controller;

import com.ocemtech.entities.Course;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/home")
public class Home {

    @GetMapping("/")
    public String home() {
        return "Home Page";
    }

    @GetMapping(path = "/{courseId}")
    public String showCourse(@PathVariable Long courseId) {
        return "Show Course by ID: "+courseId;
    }

    @GetMapping("/all")
    public  String getCourses() {
        return "Return all course";
    }


    @PostMapping("/")
    public Course add(@RequestBody Course newCourse) {

        return newCourse;
    }
}

