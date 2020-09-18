package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.model.AlienModel;

@RepositoryRestResource(collectionResourceRel = "aliens", path = "aliens")
public interface AlienRepository extends JpaRepository<AlienModel, Integer> {

}
