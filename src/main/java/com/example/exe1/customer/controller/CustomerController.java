package com.example.exe1.customer.controller;

import com.example.exe1.customer.dto.CustomerOut;
import com.example.exe1.customer.service.CustomerService;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService service){
        this.customerService=service;
    }

    @PostMapping("/add")
    public ResponseEntity<CustomerOut> addOne(@RequestBody CustomerOut customerOut){
        return ResponseEntity.ok(customerService.addOne(customerOut));

    }
    @GetMapping("/phones")
    public ResponseEntity<List<String>>getPhones(){
        return ResponseEntity.ok(customerService.getPhones());
    }
    @GetMapping("/phones/{name}")
    public ResponseEntity<List<String>>getPhones(@PathVariable("name") String l1){
        return ResponseEntity.ok(customerService.getPhones(l1));
    }
}
