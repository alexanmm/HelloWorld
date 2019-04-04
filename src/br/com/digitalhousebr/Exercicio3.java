package br.com.digitalhousebr;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] arqs){

        Integer numero;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o um número inteiro:");
        numero = scanner.nextInt();

        System.out.println((numero % 2 != 0) && numero > 10);


    }

}
