package com.example.demo.repository;

import com.example.demo.dto.Cancers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CancersRepository extends JpaRepository<Cancers,Long> {

}
