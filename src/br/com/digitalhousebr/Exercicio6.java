package br.com.digitalhousebr;

public class Exercicio6 {

    public static void main(String[] arqs) {

//6. Escreva um programa que receba um Array de números e retorne um Array
//com todos os elementos pares dele

        Integer[] arrayNumeros = new Integer[4];
        Integer[] arrayNumerosPares = new Integer[4];

        arrayNumeros[0] = 1;
        arrayNumeros[1] = 2;
        arrayNumeros[2] = 3;
        arrayNumeros[3] = 4;

        arrayNumerosPares = retornarArrayPares(arrayNumeros);

        for (int i = 0; i < arrayNumerosPares.length; i++){
            if (arrayNumerosPares[i] != null) {

               System.out.println("Resultado: " + arrayNumerosPares[i]);
            }
        }

    }

    public static Integer[] retornarArrayPares(Integer[] arrayNumeros){

        Integer[] arrayRetornoPares = new Integer[arrayNumeros.length];

        Integer cont = 0;

        for (int i = 0; i < arrayNumeros.length; i++){
            if (arrayNumeros[i] % 2 == 0 ){

                arrayRetornoPares[cont] = arrayNumeros[i];

                cont++;
            }

        }

        return arrayRetornoPares;

    }
}
