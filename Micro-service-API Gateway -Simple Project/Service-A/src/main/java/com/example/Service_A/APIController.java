package com.example.Service_A;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/serviceA")
public class APIController
{
    @GetMapping("/displayMessage")
    public ResponseEntity<String> showMessage()
    {
        return ResponseEntity.ok("Microservice 1 controller executed");
    }
}
