package com.example.demo.CancerMapper;

import com.example.demo.dto.Cancers;
import com.example.demo.dto.CancersMain;

public class CancerMapper {
    public static Cancers maptoCancers(CancersMain cancer){
        return new Cancers(
                cancer.getName(),
                cancer.getCauses(),
                cancer.getSymptoms(),
                cancer.getTreatment(),
                cancer.getId()

        );
    }

    public static CancersMain cancer(Cancers cancers){
        return new CancersMain(
                cancers.name(),
                cancers.causes(),
                cancers.symptoms(),
                cancers.treatment(),
                cancers.id()
        );
    }


}
