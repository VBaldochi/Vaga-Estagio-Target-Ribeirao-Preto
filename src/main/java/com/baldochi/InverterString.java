package com.baldochi;

import java.util.Scanner;

public class InverterString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a string: ");
        String str = scanner.nextLine();

        StringBuilder strInvertida = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            strInvertida.append(str.charAt(i));
        }

        // Impressão da string invertida
        System.out.println("String invertida: " + strInvertida);
    }
}
