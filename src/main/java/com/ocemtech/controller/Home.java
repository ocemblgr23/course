package com.ocemtech.controller;

import com.ocemtech.entities.Course;
import com.ocemtech.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/home")
public class Home {


    @Autowired
    private CourseRepository courseRepository;

    @GetMapping("/")
    public String home() {
        return "Home Page";
    }

    @GetMapping(path = "/{courseId}")
    public String showCourse(@PathVariable int courseId) {
        return "Show Course by ID: "+courseId;
    }

    @GetMapping("/all")
    public  Iterable<Course> getCourses() {
        return courseRepository.findAll();
    }


    @PostMapping("/")
    public Course add(@RequestBody Course newCourse) {
        return courseRepository.save(newCourse);
    }
}

