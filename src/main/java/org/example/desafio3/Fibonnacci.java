package org.example.desafio3;

import java.util.Scanner;

public class Fibonnacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de N para calcular o Fibonacci: ");
        int valorFib = scanner.nextInt();

        if (valorFib < 0 ){
            throw new IllegalArgumentException("O valor nao pode ser negativo");
        }
        if (valorFib < 2){
            System.out.println(valorFib);
        }

        long [] fibonacci = new long[valorFib + 1];
         fibonacci [0] = 0;
         fibonacci[1] = 1;
        for (int i = 2; i <= valorFib; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        System.out.println(fibonacci[valorFib]);
    }
}
