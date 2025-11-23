package com.example.demo.service;

import com.example.demo.entity.CancersMain;

import java.util.List;

public interface CancersServ {
    CancersMain getName(String name);
    CancersMain getCauses(String causes);
    CancersMain getSymptoms(String symptoms);
    CancersMain getTreatment(String treatment);
    CancersMain getId(Long id);
    List<CancersMain> getAll();
}
