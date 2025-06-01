package com.example.demo.controller;

import com.example.demo.io.Cancers;
import com.example.demo.service.CancerServImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/Cancers")
public class CancersController {

    private final CancerServImpl cancerServImplem;
    @Autowired
    public CancersController(CancerServImpl cancerServImplem) {
        this.cancerServImplem = cancerServImplem;
    }

    @GetMapping("/{name}")
    public Cancers getCancerlist(@PathVariable String name) {
        return cancerServImplem.getName(name);
    }


}
