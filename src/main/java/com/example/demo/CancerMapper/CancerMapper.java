package com.example.demo.CancerMapper;

import com.example.demo.dto.Cancers;
import com.example.demo.entity.CancersMain;

public class CancerMapper {
    //converts CancersMain which is an entity to DTO
    public static Cancers toDto(CancersMain entity){
        return new Cancers(
                entity.getName(),
                entity.getCauses(),
                entity.getSymptoms(),
                entity.getTreatment(),
                entity.getId()

        );
    }
    //converts Cancers which is a record DTO to entity
    public static CancersMain toEntity(Cancers dto){
        return new CancersMain(
                dto.name(),
                dto.causes(),
                dto.symptoms(),
                dto.treatment(),
                dto.id()
        );
    }


}
