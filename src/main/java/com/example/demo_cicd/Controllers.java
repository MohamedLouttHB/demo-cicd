package com.example.demo_cicd;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/welcome")
public class Controllers {

    @GetMapping()
    public ResponseEntity<String> welcome(){
        return ResponseEntity.ok("Welcome : Second tests and vdsdk");
    }

}
