package com.barresi.u5w2d2.controllers;


import com.barresi.u5w2d2.entities.Autore;
import com.barresi.u5w2d2.services.AutoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/autore")
public class AutoreController {


    @Autowired
    AutoreService autoreService;




    @GetMapping
    public List<Autore> getListaAutori(){
        return autoreService.getListaAutore();
    }


    @GetMapping("/{id}")
    public Autore findAutoreById(@PathVariable long id){
        return autoreService.findAutoreByid(id);
    }

    @PostMapping
    public Autore saveAuthor(@RequestBody Autore autore){
        return autoreService.saveAutore(autore);
    }

    @PutMapping("/{id}")
    public Autore updateAutore(@PathVariable long id ,@RequestBody Autore autore){
        return autoreService.updateAutore(id, autore);
    }

    @DeleteMapping("/{id}")
    public void deleteAutore(@PathVariable long id){
       autoreService.findAndDelete(id);
    }






}
