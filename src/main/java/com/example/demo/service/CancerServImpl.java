package com.example.demo.service;

import com.example.demo.dto.Cancers;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CancerServImpl implements CancersServ {
    List<Cancers> cancerDisease = Cancers.cancerDisease;

    public Cancers getName(String name) {
        return cancerDisease.stream()
                .filter(n -> n.name().equals(name))
                .findFirst().orElse(null);


    }

    public Cancers getCauses(String causes) {
        return cancerDisease.stream()
                .filter(c -> c.causes().equals(causes))
                .findFirst().orElse(null);

    }

    public Cancers getSymptoms(String symptoms) {
        return cancerDisease.stream()
                .filter(s -> s.symptoms().equals(symptoms))
                .findFirst().orElse(null);
    }

    public Cancers getTreatment(String treatment) {
        return cancerDisease.stream()
                .filter(t -> t.treatment().equals(treatment))
                .findFirst().orElse(null);

    }

    public Cancers getId(Long id) {
        return cancerDisease.stream()
                .filter(i -> i.id().equals(id))
                .findFirst().orElse(null);
    }

}