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

        System.out.println(obtenerDistanciaEntrePuntos(pp.getX(), pp2.getX(), pp.getY(), pp2.getY()));

    }


    public static boolean chequearColisionDeRectangulos(){



        return false;
    }




    public static double obtenerDistanciaEntrePuntos(double x1, double x2, double y1, double y2) {

        // formula
        return Math.sqrt(Math.pow(x1 - x2,2) + Math.pow(y1 - y2,2));
    }
}