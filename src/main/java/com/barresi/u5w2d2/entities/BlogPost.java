package com.barresi.u5w2d2.entities;


import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class BlogPost {
    private long id;

    private String categoria;

    private String titolo;

    private String cover;

    private int tempo_di_lettura;
}
