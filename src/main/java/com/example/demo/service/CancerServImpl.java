package com.example.demo.service;

import com.example.demo.CancerMapper.CancerMapper;
import com.example.demo.ResourceNotFoundException;
import com.example.demo.dto.Cancers;
import com.example.demo.entity.CancersMain;
import com.example.demo.repository.CancersRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class CancerServImpl implements CancersServ {
   private final CancersRepository repository;

   public CancerServImpl(CancersRepository repository){
       this.repository = repository;
   }


    //save method
    public Cancers save(Cancers cancer){
        return cancer;
    }

    @Override
    public Cancers getName(String name) {
        CancersMain entity = repository.findByName(name)
                .orElseThrow(()-> new ResourceNotFoundException("Cancer not found with causes " + name));
        return  CancerMapper.toDto(entity);
   }

    public Cancers getCauses(String causes) {
        CancersMain entity = repository.findByCauses(causes)
                .orElseThrow(()-> new ResourceNotFoundException("Cancer not found with causes " + causes));
        return  CancerMapper.toDto(entity);

    }

    public Cancers getSymptoms(String symptoms) {
        CancersMain entity = repository.findBySymptoms(symptoms)
                .orElseThrow(()-> new ResourceNotFoundException("Cancer not found with symmptoms " + symptoms));
        return  CancerMapper.toDto(entity);
    }

    public Cancers getTreatment(String treatment) {
        CancersMain entity = repository.findByTreatment(treatment)
                .orElseThrow(()-> new ResourceNotFoundException("Cancer not found with treatment " + treatment));
        return  CancerMapper.toDto(entity);

    }

    public Cancers getId(Long id) {
        CancersMain entity = repository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Cancer not found with id " +  id));
        return  CancerMapper.toDto(entity);
    }

}