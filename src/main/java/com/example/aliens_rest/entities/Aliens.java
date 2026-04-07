package com.example.aliens_rest.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
//si tiene nombre diferente a la tabla
// @Table("adad")
public class Aliens {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false,length = 150)
    private String name;

    @Column(nullable = false,length = 50)
    private String species;

    @Column(nullable = false,length = 50)
    private String planet;

}
