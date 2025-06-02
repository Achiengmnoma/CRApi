package com.example.demo.controller;

import com.example.demo.CancerMapper.CancerMapper;
import com.example.demo.dto.Cancers;
import com.example.demo.dto.CancersMain;
import com.example.demo.repository.CancersRepository;
import com.example.demo.service.CancerServImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/Cancers")
public class CancersController {
//    @Autowired
//    private final CancerServImpl cancerServImplem;
//
//
//    public CancersController(CancerServImpl cancerServImplem) {
//        this.cancerServImplem = cancerServImplem;
//    }
//
//    @GetMapping("/{name}")
//    public Cancers getCancerlist(@PathVariable String name) {
//        return cancerServImplem.getName(name);
//    }
//
    @Autowired
    private CancersRepository cancersRepository;

    @GetMapping("/{id}")
    public ResponseEntity<Cancers> getCancer(@PathVariable Long id){
        CancersMain cancer = cancersRepository.findById(id).orElseThrow();
        return ResponseEntity.ok(CancerMapper.maptoCancers(cancer));


    }





}
