package com.barresi.u5w2d2.entities;

import lombok.*;
import org.springframework.stereotype.Service;

import java.time.LocalDate;


@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Autore {
    private long id;
    private String nome;
    private String cognome;
    private LocalDate data_di_nascita;
    private String avatar;
}
