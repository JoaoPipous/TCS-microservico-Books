package com.TCS.microservico_Books.entities;

import jakarta.persistence.*;


import java.io.Serializable;

@Entity
@Table(name = "tb_books")
public class Book implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String titulo;
    private String autor;
    private int ano;
    private String genero;

    public Book() {

    }

    public Book(long id, String titulo, String autor, int ano, String genero) {
        super();
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.genero = genero;
    }

    public Book(String titulo, String autor, int ano,  String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.genero = genero;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void getGenero(String genero) {
        this.genero = genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
