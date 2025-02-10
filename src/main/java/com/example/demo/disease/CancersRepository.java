package com.example.demo.disease;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CancersRepository extends JpaRepository<Cancers,Long> {
}
