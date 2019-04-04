package br.com.digitalhousebr;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] arqs){

        Integer numero1;
        Integer numero2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        numero1 = scanner.nextInt();

        System.out.println("Digite o segundo número:");
        numero2 = scanner.nextInt();

        System.out.println(numero1 < numero2);

    }

}
