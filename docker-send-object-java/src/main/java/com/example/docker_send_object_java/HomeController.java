package com.example.docker_send_object_java;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/home")
public class HomeController {

    @GetMapping
    public ResponseEntity<Result> sendData(){

        Result rs = new Result(
                UUID.randomUUID(),
                "welcome to mario's world"
        );

        return new ResponseEntity<>(rs, HttpStatus.OK);

    }

}
