package br.com.digitalhousebr;

public class Exercicio5 {

    public static void main(String[] arqs) {


        //5. Escrever um programa que receba um Array e retorne a soma de todos os
        //elementos pares do Array.

        Integer[] arrayNumeros = new Integer[4];

        arrayNumeros[0] = 1;
        arrayNumeros[1] = 2;
        arrayNumeros[2] = 3;
        arrayNumeros[3] = 4;

        System.out.println("Resultado: " + verificarPares(arrayNumeros));

    }

    public static Integer verificarPares(Integer[] arrayNumeros){

        Integer somaPares = 0;

        for (int i = 0; i < arrayNumeros.length; i++){
            if (arrayNumeros[i] % 2 == 0 ){
                somaPares = somaPares + arrayNumeros[i];
            }

        }

        return somaPares;

    }

}
