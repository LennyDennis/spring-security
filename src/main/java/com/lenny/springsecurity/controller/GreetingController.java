package com.lenny.springsecurity.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/greetings")
public class GreetingController {

    @GetMapping
    public ResponseEntity<String> greeting(){
        return ResponseEntity.ok("Hello World");
    }

    @GetMapping("/goodbye")
    public ResponseEntity<String> sayGoodbye(){
        return ResponseEntity.ok("Hello Bye!");
    }

}
