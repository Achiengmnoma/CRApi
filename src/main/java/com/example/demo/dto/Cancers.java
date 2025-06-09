package com.example.demo.dto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public record Cancers(String name,String causes,String symptoms,String treatment,Long id) {
    public static List<Cancers> cancerDisease = new ArrayList<>(Arrays.asList());

}
