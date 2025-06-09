package com.example.demo.CancerMapper;

import com.example.demo.dto.Cancers;
import com.example.demo.entity.CancersMain;

public class CancerMapper {
    //takes CancerMain which is entity and converts to dto
    public static Cancers maptoCancers(CancersMain cancer){
        return new Cancers(
                cancer.getName(),
                cancer.getCauses(),
                cancer.getSymptoms(),
                cancer.getTreatment(),
                cancer.getId()

        );
    }
    //takes Cancers which is record and dto and converts back to entity
    public static CancersMain maptoEntity(Cancers cancers){
        return new CancersMain(
                cancers.name(),
                cancers.causes(),
                cancers.symptoms(),
                cancers.treatment(),
                cancers.id()
        );
    }


}
