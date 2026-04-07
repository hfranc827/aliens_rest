package com.example.aliens_rest.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.aliens_rest.entities.Aliens;
import com.example.aliens_rest.repositories.AliensRepository;

import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("aliens")
//Inyeccion de dependencias
@RequiredArgsConstructor
public class AlienRestController {

    /* public AlienRestController (AliensRepository repository){
        this.repository = repository;
    }
 */
//Inyeccion dependencias
    private final AliensRepository repository;
    
    @GetMapping
    public List<Aliens> aliensList() {
        return repository.findAll();
    }


    @GetMapping("/{id}")
    public Aliens alienById(@PathVariable Long id) {
        return repository.findById(id).orElseThrow();
    }


    


    /* @GetMapping("saludo")
    public String saludo() {
        return "Saludos de los aliens";
    }

    @GetMapping("saludo/{nombre}")
    public String saludoPersonalizado(@PathVariable("nombre") String nom) {
        return String.format( "Saludo %s de nosotros los alines",nom);
    }

    @GetMapping("despedida")
    public String despedida(String planeta ,String nombre , String signo) {
        return String.format( "Nos despedimos del planeta %s , de la persona %s que tiene signo %s",planeta,nombre,signo);
    } */

    


}
