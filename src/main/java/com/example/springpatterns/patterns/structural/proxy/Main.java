package com.example.springpatterns.patterns.structural.proxy;

public class Main {

    public static void main(String[] args){

        Image img = new ProxyImage("holamundo.jpg");
        // El proxy crea el objeto por primera vez
        img.show();

        System.out.println("==================================================");
        // El proxy ya tiene la imagen creada y solo lo muestra
        img.show();
    }
}
