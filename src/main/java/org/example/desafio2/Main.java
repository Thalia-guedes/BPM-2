package org.example.desafio2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os em segundos: ");
        //exemplo 703020202
        long segundos = scanner.nextLong();

        long converter = segundos * 1000L;

        Date data = new Date(converter);
        SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        formatar.setTimeZone(TimeZone.getTimeZone("UTC"));

        System.out.println(formatar.format(data));

    }
}
