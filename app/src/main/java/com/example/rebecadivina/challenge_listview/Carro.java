package com.example.rebecadivina.challenge_listview;

import java.io.Serializable;

/**
 * Created by uc15101831 on 29/08/2018.
 */

public class Carro implements Serializable {
    private String fabricante;
    private String nome;

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    private int img;

    public Carro(String fabricante, String nome, int img){
        this.fabricante = fabricante;
        this.nome = nome;
        this.img = img;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }





}
