package com.baldochi;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int numero = scanner.nextInt();

        System.out.println("Valores na sequência de Fibonacci: ");
        int fibonacci = scanner.nextInt();

        int[] array = new int[fibonacci];
        int primeiro = 0;
        int segundo = 1;
        int proximo = 0;

        for (int i = 0; i < fibonacci; i++) {
            if (i <= 1) {
                proximo = i;
            } else {
                proximo = primeiro + segundo;
                primeiro = segundo;
                segundo = proximo;
            }
            array[i] = proximo;
            System.out.println(proximo);
        }
        boolean encontrado = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == numero) {
                encontrado = true;
                break;
            }
        }

// Exibição da mensagem final
        if (encontrado) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci!");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }
    }}