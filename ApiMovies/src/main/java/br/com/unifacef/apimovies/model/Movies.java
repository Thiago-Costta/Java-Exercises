package br.com.unifacef.apimovies.model;

import java.math.BigDecimal;

public class Movies {
    private int id;
    private String nome;
    private String genero;
    private String direcao;
    private BigDecimal nota;

    public Movies() {
    }

    public Movies(int id, String nome, String genero, String direcao, BigDecimal nota) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.direcao = direcao;
        this.nota = nota;
    }

    public String getDirecao() {
        return direcao;
    }

    public void setDirecao(String direcao) {
        this.direcao = direcao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getNota() {
        return nota;
    }

    public void setNota(BigDecimal nota) {
        this.nota = nota;
    }
}
