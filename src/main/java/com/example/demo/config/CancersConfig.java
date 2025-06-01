package com.example.demo.config;

import com.example.demo.io.Cancers;
import com.example.demo.repository.CancersRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class CancersConfig {
}
//public class CancersConfig {
//
//    @Bean
//    CommandLineRunner commandLineRunner(CancersRepository cancersRepository){
//        return args -> {
//            Cancers cancer1 = new Cancers("Acute philomena", "poor diet", "consistent stomachaches", "take exercises regularly");
//            Cancers cancer2 = new Cancers("Anemia", "iron deficiency", "fatigue", "increase iron intake");
//            Cancers cancer3 = new Cancers( "Breast Cancer", "genetic factors", "lump in breast", "regular screening");
//            Cancers cancer4 = new Cancers( "Bronchitis", "smoking", "persistent cough", "quit smoking");
//            Cancers cancer5 =new Cancers( "Colon Cancer", "low fiber diet", "abdominal pain", "high fiber diet");
//
//            cancersRepository.saveAll(List.of(cancer1, cancer2, cancer3, cancer4, cancer5));
//        };
//    }
//
//}


