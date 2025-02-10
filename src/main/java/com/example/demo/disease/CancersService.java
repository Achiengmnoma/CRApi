package com.example.demo.disease;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class CancersService {

    private final CancersRepository cancersRepository;

    @Autowired
    public CancersService(CancersRepository cancersRepository) {
        this.cancersRepository = cancersRepository;
    }

    public Cancerslist getCancerlist(){


            List<Cancers> cancers = cancersRepository.findAll();

            Map<String, List<Cancers>> letterOrder = cancers.stream().collect(Collectors.groupingBy(
                cancer -> cancer.getName().substring(0,1).toUpperCase()
/*
        List<Cancers> cancers = List.of(
                new Cancers(
                23L,"Acute philomena",
                "poor diet",
                "consistent stomachaches",
                "take exercises regularly"
        ),
                new Cancers(24L, "Anemia", "iron deficiency", "fatigue", "increase iron intake"),
                new Cancers(25L, "Breast Cancer", "genetic factors", "lump in breast", "regular screening"),
                new Cancers(26L, "Bronchitis", "smoking", "persistent cough", "quit smoking"),
                new Cancers(27L, "Colon Cancer", "low fiber diet", "abdominal pain", "high fiber diet")
        );
 Fetch all Cancers entities from the database
*/
        ));

        return new Cancerslist(letterOrder);
    }
}
