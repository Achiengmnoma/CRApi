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
    public ResponseEntity<CancersMain> addDiseases(@RequestBody CancersMain cancers){
        CancersMain saved = services.save(cancers);
        return new ResponseEntity<>(saved, HttpStatus.CREATED);
        //return ResponseEntity.ok(saved);
    }

    @GetMapping
    public ResponseEntity<List<CancersMain>> getAll(){
        List<CancersMain> cancers = services.getAll();
        return ResponseEntity.ok(cancers);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CancersMain> getId(@PathVariable Long id) {
        CancersMain cancer = services.getId(id);
        return ResponseEntity.ok(cancer);
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<CancersMain> getName(@PathVariable String name){
        CancersMain cancer = services.getName(name);
        return ResponseEntity.ok(cancer);
    }

    @GetMapping("/causes/{causes}")
    public ResponseEntity<CancersMain> getCauses(@PathVariable String causes){
        CancersMain cancer = services.getCauses(causes);
        return ResponseEntity.ok(cancer);
    }

    @GetMapping("/symptoms/{symptoms}")
    public ResponseEntity<CancersMain> getSymptoms(@PathVariable String symptoms){
        CancersMain cancer = services.getSymptoms(symptoms);
        return ResponseEntity.ok(cancer);
    }

    @GetMapping("/treatment/{treatment}")
    public ResponseEntity<CancersMain> getTreatment(@PathVariable String treatment){
        CancersMain cancer = services.getTreatment(treatment);
        return ResponseEntity.ok(cancer);
    }

}
