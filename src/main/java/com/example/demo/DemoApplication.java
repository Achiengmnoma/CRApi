package com.example.demo;

import com.example.demo.disease.Cancers;
import com.example.demo.disease.Cancerslist;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

//	@GetMapping
//	public Cancerslist getCancerlist(){
//		List<Cancers> cancers = List.of(new Cancers(
//				23L,"Acute philomena",
//				"poor diet",
//				"consistent stomachaches",
//				"take exercises regularly"
//				));
//		return new Cancerslist("A",cancers);
//	}THIS IS THE OFFICIAL ONE BEFORE CONTROLLER IS INTRODUCED

/*
 public List<Cancers> hey(){
 	return List.of(new Cancers(
 			23l,"Acute philomena",
 			"poor diet",
 			"consistent stomachaches",
 			"take exercises regulary"

 	));
 }
*/


}
