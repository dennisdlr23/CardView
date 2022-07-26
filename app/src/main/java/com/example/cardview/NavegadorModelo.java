package com.example.cardview;

public class NavegadorModelo {
    private String navegador, creador;
    private int imgNavegador;

    public NavegadorModelo() {
    }

    public NavegadorModelo(String navegador, String creador, int imgNavegador) {
        this.navegador = navegador;
        this.creador = creador;
        this.imgNavegador = imgNavegador;
    }

    public String getNavegador() {
        return navegador;
    }

    public void setNavegador(String navegador) {
        this.navegador = navegador;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public int getImgNavegador() {
        return imgNavegador;
    }

    public void setImgNavegador(int imgNavegador) {
        this.imgNavegador = imgNavegador;
    }
}
