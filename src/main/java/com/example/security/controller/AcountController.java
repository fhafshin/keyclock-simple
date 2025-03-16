package com.example.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AcountController {

    @GetMapping("/myAccount")
     String  getAccountDetails(){
        return "here is the account details from the db";
    }
}
