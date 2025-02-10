package com.example.demo.disease;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/Cancers")
public class CancersController {

    private final CancersService cancersService;
    @Autowired
    public CancersController(CancersService cancersService) {
        this.cancersService = cancersService;
    }

    @GetMapping
    public Cancerslist getCancerlist(){
        return cancersService.getCancerlist();
    }
}
