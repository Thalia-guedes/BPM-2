package org.example.desafio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrdenandoNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de numeros para ordernar: ");
        int numeros = scanner.nextInt();


        List<Integer> numerosPares = new ArrayList<>();
        List<Integer> numerosImpares = new ArrayList<>();

        for (int i = 0; i < numeros; i++) {
            System.out.println("Digite o numero: ");
            int numerosAdd = scanner.nextInt();

            if (numerosAdd % 2 == 0) {
                numerosPares.add(numerosAdd);
            } else {
                numerosImpares.add(numerosAdd);
            }
        }
        System.out.println("Números pares:");
        for (int num : numerosPares) {
            System.out.println(num);
        }

        System.out.println("Números ímpares:");
        for (int num : numerosImpares) {
            System.out.println(num);
        }

    }
}
