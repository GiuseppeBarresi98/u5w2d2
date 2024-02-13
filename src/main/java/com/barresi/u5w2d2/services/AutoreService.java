package com.barresi.u5w2d2.services;


import com.barresi.u5w2d2.entities.Autore;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

@Service
public class AutoreService {

    List<Autore> lista_autori = new ArrayList<>();

    public List<Autore> getListaAutore(){
        return this.lista_autori;
    }

    public Autore findAutoreByid(long id){
        Autore found = null;
        for(Autore autore : lista_autori){
            if (autore.getId()== id){
                found = autore;
            }
        }
        return found;
    }

    public Autore saveAutore(Autore autore){
        Random random = new Random();
        autore.setId(random.nextInt(1,20));
        lista_autori.add(autore);
        return autore;
    }

    public Autore updateAutore(long id,Autore autore) {
        Autore found = null;
        for (Autore autore1 : this.lista_autori){
            if(autore1.getId()== id){
                found = autore1;
                found.setNome(autore.getNome());
                found.setAvatar(autore.getAvatar());
                found.setData_di_nascita(autore.getData_di_nascita());
            }
        }
        return found;
    }


    public void findAndDelete(long id) {
        Iterator<Autore> iterator = this.lista_autori.iterator();
        while (iterator.hasNext()) {
            Autore autore = iterator.next();
            if (autore.getId() == id) {
                iterator.remove();
            }
        }
    }
}
