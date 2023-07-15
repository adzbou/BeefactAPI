package com.example.beeapispring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class APIController {
    Beefacts beeFactObj = new Beefacts();


    @RequestMapping(value = "/get-bee-fact", method = RequestMethod.GET)
    public String GetBee(){
        return beeFactObj.GetBeeFact();
    }
}
