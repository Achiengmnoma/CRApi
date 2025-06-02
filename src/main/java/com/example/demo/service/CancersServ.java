package com.example.demo.service;

import com.example.demo.dto.Cancers;

public interface CancersServ {
    Cancers getName(String name);
    Cancers getCauses(String causes);
    Cancers getSymptoms(String symptoms);
    Cancers getTreatment(String treatment);
    Cancers getId(Long id);
}
