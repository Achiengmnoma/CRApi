package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "cancers")
public class CancersMain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    String name;
    String causes;
    String symptoms;
    String treatment;
    Long id;

    public CancersMain(String name, String causes, String symptoms, String treatment, Long id) {
        this.name = name;
        this.causes = causes;
        this.symptoms = symptoms;
        this.treatment = treatment;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCauses() {
        return causes;
    }

    public void setCauses(String causes) {
        this.causes = causes;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
