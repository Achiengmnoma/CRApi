package com.example.demo.repository;

import com.example.demo.entity.CancersMain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CancersRepository extends JpaRepository<CancersMain,Long> {

    Optional<CancersMain> findByName(String name);

    Optional <CancersMain> findByCauses(String causes);

   Optional <CancersMain> findBySymptoms(String symptoms);

    Optional<CancersMain> findByTreatment(String treatment);
}
