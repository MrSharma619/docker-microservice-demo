package com.example.docker_receive_object_java;

import java.util.UUID;

public class ResultDto {

    private UUID id;

    private String message;

    public ResultDto(UUID id, String message) {
        this.id = id;
        this.message = message;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
