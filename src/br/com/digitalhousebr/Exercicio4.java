package br.com.digitalhousebr;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] arqs){

        Integer[] arrayNumeros = new Integer[4];
        Integer resultado = 0;

        arrayNumeros[0] = 10;
        arrayNumeros[1] = 20;
        arrayNumeros[2] = 30;
        arrayNumeros[3] = 40;

        for (int i = 0; i < arrayNumeros.length; i++){
            resultado = resultado + arrayNumeros[i];
        }

        System.out.println("Resultado: " + resultado);


    }
}
