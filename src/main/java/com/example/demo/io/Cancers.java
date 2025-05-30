package com.example.demo.io;

import jakarta.persistence.*;

@Entity
@Table
public class Cancers {

    @Id
    @SequenceGenerator(
            name = "cancers_sequence",
            sequenceName = "cancers_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "cancers_sequence"
    )

    private String name;
    private String causes;
    private String symptoms;
    private String treatment;
    private Long id;
    //determines the order in which its returned

    public Cancers(String name, String causes, String symptoms, String treatment,Long id) {

    }

    public Cancers(Long id, String name, String causes, String symptoms, String treatment) {//how to list them when you want a return
        this.id = id;
        this.name = name;
        this.causes = causes;
        this.symptoms = symptoms;
        this.treatment = treatment;
    }

    public Cancers(String name, String causes, String symptoms, String treatment) {
        this.name = name;
        this.causes = causes;
        this.symptoms = symptoms;
        this.treatment = treatment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    @Override
    public String toString() {
        return "Cancers{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", causes='" + causes + '\'' +
                ", symptoms='" + symptoms + '\'' +
                ", treatment='" + treatment + '\'' +
                '}';
    }
}
