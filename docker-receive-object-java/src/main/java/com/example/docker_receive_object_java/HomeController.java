package com.example.docker_receive_object_java;

import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RequestMapping("/api/home/v2")
public class HomeController {

    @GetMapping
    public ResponseEntity<ResultDto> printData(){
        ResultDto dto;

        //base url

        //in local
        //WebClient client = WebClient.create("http://localhost:8080");

        //in docker
        WebClient client = WebClient.create("http://send-object:8080");

        dto = client.get()
                .uri("/api/home")
                .retrieve()
                .bodyToMono(ResultDto.class)
                .block();

        if(dto != null)
            return new ResponseEntity<>(dto, HttpStatus.OK);

        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);

    }

}
