package com.example.demo.controller;

import com.example.demo.CancerMapper.CancerMapper;
import com.example.demo.ResourceNotFoundException;
import com.example.demo.dto.Cancers;
import com.example.demo.entity.CancersMain;
import com.example.demo.repository.CancersRepository;
import com.example.demo.service.CancerServImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/cancers")
public class CancersController {

    private CancerServImpl services;

    public CancersController(CancerServImpl services){
        this.services = services;
    }

    @PostMapping
    public ResponseEntity<Cancers> addDiseases(@RequestBody Cancers cancers){
        Cancers saved = services.save(cancers);
        return new ResponseEntity<>(saved, HttpStatus.CREATED);
    }

    @GetMapping
    public List<Cancers> getAll(){
        return services.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cancers> getId(@PathVariable Long id) {
        return ResponseEntity.ok(services.getId(id));
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<Cancers> getName(@PathVariable String name){
        return ResponseEntity.ok(services.getName(name));
    }

    @GetMapping("/causes/{causes}")
    public ResponseEntity<Cancers> getCauses(@PathVariable String causes){
        return ResponseEntity.ok(services.getCauses(causes));
    }

    @GetMapping("/symptoms/{symptoms}")
    public ResponseEntity<Cancers> getSymptoms(@PathVariable String symptoms){
        return ResponseEntity.ok(services.getSymptoms(symptoms));
    }

    @GetMapping("/treatment/{treatment}")
    public ResponseEntity<Cancers> getTreatment(@PathVariable String treatment){
        return ResponseEntity.ok(services.getTreatment(treatment));
    }

}
