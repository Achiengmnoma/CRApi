package com.example.demo.service;

import com.example.demo.CancerMapper.CancerMapper;
import com.example.demo.ResourceNotFoundException;
import com.example.demo.entity.CancersMain;
import com.example.demo.repository.CancersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CancerServImpl implements CancersServ {
   private final CancersRepository repository;

   public List<CancersMain> getAll(){
       return repository.findAll();
   }

   @Autowired
   public CancerServImpl(CancersRepository repository){
       this.repository = repository;
   }


    //save method
    @Transactional
    public CancersMain save(CancersMain cancer){
        return repository.save(cancer);
    }

    @Override
    public CancersMain getName(String name) {
        return repository.findByName(name)
                .orElseThrow(()-> new ResourceNotFoundException("Cancer not found with causes " + name));
       // return  CancerMapper.toDto(entity);
   }

    public CancersMain getCauses(String causes) {
        return repository.findByCauses(causes)
                .orElseThrow(()-> new ResourceNotFoundException("Cancer not found with causes " + causes));
        //return  CancerMapper.toDto(entity);

    }

    public CancersMain getSymptoms(String symptoms) {
       return repository.findBySymptoms(symptoms)
                .orElseThrow(()-> new ResourceNotFoundException("Cancer not found with symptoms " + symptoms));
        //return  CancerMapper.toDto(entity);
    }

    public CancersMain getTreatment(String treatment) {
        return repository.findByTreatment(treatment)
                .orElseThrow(()-> new ResourceNotFoundException("Cancer not found with treatment " + treatment));
        //return  CancerMapper.toDto(entity);

    }

    public CancersMain getId(Long id) {
        return repository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Cancer not found with id " +  id));
        //return  CancerMapper.toDto(entity);
    }

}