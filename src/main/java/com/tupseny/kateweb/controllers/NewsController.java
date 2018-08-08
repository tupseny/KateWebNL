package com.tupseny.kateweb.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/news/{action}")
public class NewsController {
    @GetMapping
    String addGet(@PathVariable String action){
        return "Use only POST request for \"" + action + "\"";
    }

    @PostMapping
    String addPost(@PathVariable String action){
        return "this is answer on POST request on " + action;
    }


}
