package com.example.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoansController {


    @GetMapping("/myLoans")
     String  getLoansDetails(){
        return "here is the loans from db" ;
    }
}
