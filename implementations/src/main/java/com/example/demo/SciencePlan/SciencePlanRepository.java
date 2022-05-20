package com.example.demo.SciencePlan;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SciencePlanRepository extends CrudRepository<SciencePlan, Integer> {
}
