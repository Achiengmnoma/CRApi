package com.example.demo.disease;



import com.example.demo.io.Cancers;

import java.util.List;
import java.util.Map;

public class Cancerslist {

    private Map<String,List <Cancers>> orderByLetter;

    public Cancerslist(Map<String, List<Cancers>> orderByLetter) {
        this.orderByLetter = orderByLetter;
    }

    public Map<String, List<Cancers>> getOrderByLetter() {
        return orderByLetter;
    }

    public void setOrderByLetter(Map<String, List<Cancers>> orderByLetter) {
        this.orderByLetter = orderByLetter;
    }

    @Override
    public String toString() {
        return "Cancerslist{" +
                "orderByLetter=" + orderByLetter +
                '}';
    }
    /*
use map for grouping with certain similarities
    private String idAlphabet;
    private List<Cancers> cancersList;

    public Cancerslist() {//means the section can be empty
    }

    public Cancerslist(String idAlphabet, List<Cancers> cancersList) {
        this.idAlphabet = idAlphabet;
        this.cancersList = cancersList;
    }

    public String getIdAlphabet() {
        return idAlphabet;
    }

    public void setIdAlphabet(String idAlphabet) {
        this.idAlphabet = idAlphabet;
    }

    public List<Cancers> getCancersList() {
        return cancersList;
    }

    public void setCancersList(List<Cancers> cancersList) {
        this.cancersList = cancersList;
    }

    @Override
    public String toString() {
        return "Cancerslist{" +
                "idAlphabet='" + idAlphabet + '\'' +
                ", cancersList=" + cancersList +
                '}';
    }
*/


}
