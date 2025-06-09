package com.example.demo.controller;

import com.example.demo.CancerMapper.CancerMapper;
import com.example.demo.dto.Cancers;
import com.example.demo.entity.CancersMain;
import com.example.demo.repository.CancersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping(path = "api/v1/Cancers")
public class CancersController {

    @Autowired
    private CancersRepository cancersRepository;

    @GetMapping("/{id}")
    public ResponseEntity<Cancers> getId(@PathVariable Long id) {
        CancersMain cancerEntity = cancersRepository.findById(id).orElseThrow();
        Cancers dto = CancerMapper.maptoCancers(cancerEntity);
        return ResponseEntity.ok(dto);
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<Cancers> getName(@PathVariable String name){
        CancersMain cancerEntity = cancersRepository.findByName(name).orElseThrow();
        Cancers dto = CancerMapper.maptoCancers(cancerEntity);
        return ResponseEntity.ok(dto);
    }

    @GetMapping("/causes/{causes}")
    public ResponseEntity<Cancers> getCauses(@PathVariable String causes){
        CancersMain cancerEntity = cancersRepository.findByCauses(causes).orElseThrow();
        Cancers dto = CancerMapper.maptoCancers(cancerEntity);
        return ResponseEntity.ok(dto);
    }

    @GetMapping("/symptoms/{symptoms}")
    public ResponseEntity<Cancers> getSymptoms(@PathVariable String symptoms){
        CancersMain cancerEntity = cancersRepository.findBySymptoms(symptoms).orElseThrow();
        Cancers dto = CancerMapper.maptoCancers(cancerEntity);
        return ResponseEntity.ok(dto);
    }

    @GetMapping("/treatment/{treatment}")
    public ResponseEntity<Cancers> getTreatment(@PathVariable String treatment){
        CancersMain cancerEntity = cancersRepository.findByTreatment(treatment).orElseThrow();
        Cancers dto = CancerMapper.maptoCancers(cancerEntity);
        return ResponseEntity.ok(dto);
    }

}
