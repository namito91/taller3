package com.company;

public class Rectangulo {

    private int x;
    private int y;
    private int ancho;
    private int alto;


    public Rectangulo(int x, int y, int ancho, int largo) {

        this.x = x;
        this.y = y;
        this.ancho = ancho;
        this.alto = largo;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }
}
