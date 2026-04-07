package com.example.aliens_rest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.aliens_rest.entities.Aliens;

public interface AliensRepository extends JpaRepository<Aliens,Long> {
    

}
