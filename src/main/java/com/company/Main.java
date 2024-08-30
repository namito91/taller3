package com.company;

public class Main {

    public static void main(String[] args) {

        // pp , referencia al objeto creado
        PuntosPlano pp = new PuntosPlano(3, 4);
        PuntosPlano pp2 = new PuntosPlano(5, 2);
        PuntosPlano pp3 = new PuntosPlano(1, 1);

        System.out.println("punto 1 : " + pp.getX() + " , " + pp.getY());
        System.out.println("punto 2 : " + pp2.getX() + " , " + pp2.getY());
        System.out.println("punto 3 : " + pp3.getX() + " , " + pp3.getY());

        System.out.println("distancia entre punto 1 y punto 2");

        // obtenemos las coordenadas de los 2 puntos
        double x1 = pp.getX();
        double x2 = pp2.getX();
        double y1 = pp.getY();
        double y2 = pp2.getY();

        System.out.println(obtenerDistanciaEntrePuntos(x1, x2, y1, y2));


        // creamos 2 objetos rectangulo
        Rectangulo r1 = new Rectangulo(2, 3, 4, 5);
        Rectangulo r2 = new Rectangulo(4, 4, 6, 4);

        // chequeamos si colisionan en el plano
        System.out.println("r1 y r2 colisionan : " + chequearColisionDeRectangulos(r1, r2));

    }


    public static boolean chequearColisionDeRectangulos(Rectangulo r1, Rectangulo r2) {

        // dos rectangulos colisionan en el plano si se cumple lo siguiente:
        // x1 < x2 + ancho2  AND   x2 < x1 + ancho1  AND  y1 < y2 + alto2  AND  y2 < y1 + alto1

        // obtenemos las coordenas ,alto y ancho de los 2 rectangulos
        int x1 = r1.getX();
        int y1 = r1.getY();
        int alto1 = r1.getAlto();
        int ancho1 = r1.getAncho();

        int x2 = r2.getX();
        int y2 = r2.getY();
        int alto2 = r2.getAlto();
        int ancho2 = r2.getAncho();

        return (x1 < (x2 + ancho2)) && (x2 < (x1 + ancho1)) && (y1 < (y2 + alto2)) && (y2 < (y1 + alto1));
    }


    public static double obtenerDistanciaEntrePuntos(double x1, double x2, double y1, double y2) {

        // formula
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }
}