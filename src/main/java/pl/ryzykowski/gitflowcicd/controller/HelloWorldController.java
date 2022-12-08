package pl.ryzykowski.gitflowcicd.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloWorldController {

    @GetMapping("/hello")
    public String hello(@RequestParam("name") String name){
        return "Hello " + name;
    }

}
