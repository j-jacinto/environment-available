package com.example.environment_available.controller;

import com.example.environment_available.dtos.AvailableEnvironment;
import com.example.environment_available.dtos.ResultGit;
import com.example.environment_available.services.AvailableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AvailableController {

    @Autowired
    AvailableService availableService;

    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AvailableEnvironment> getAvailable() {
        AvailableEnvironment result = availableService.getAvailableEnv();
        return ResponseEntity.ok(result);
    }
}
