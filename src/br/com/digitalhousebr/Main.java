package br.com.digitalhousebr;

import java.util.Scanner;

public class Main {


    public static void main(String[] arqs){

        Integer umNumeroA;
        Double  umNumeroB;
        String  umaCadeiaDeTexto;

        umNumeroA = 10;
        umNumeroB = 20.0;
        umaCadeiaDeTexto = "teste cadeia de texto";

        System.out.println("umNumeroA...........: " + umNumeroA);
        System.out.println("umNumeroB...........: " + umNumeroB);
        System.out.println("umaCadeiaDeTexto....: " + umaCadeiaDeTexto);
        System.out.println("Soma de A + B = " + (umNumeroA + umNumeroB));
        System.out.println("Subtração de A -B = " + (umNumeroA - umNumeroB));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        umNumeroA = scanner.nextInt();
        System.out.println("Recebi: " + umNumeroA);

    }
}
