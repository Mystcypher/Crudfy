package com.seduc2.crudfy.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "artistas")
public class Artista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String voz;
    private GeneroArt generoArt;
    private String descricao;
    private int avaliacao;

    public Artista(){}

    public Artista(int id, String nome, String voz, GeneroArt generoArt, String descricao, int avaliacao) {
        this.id = id;
        this.nome = nome;
        this.voz = voz;
        this.generoArt = generoArt;
        this.descricao = descricao;
        this.avaliacao = avaliacao;
    }
}
