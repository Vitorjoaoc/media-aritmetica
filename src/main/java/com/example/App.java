package com.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        double media = MediaAritmetica.calcularMedia(numero1, numero2);
        System.out.println("A média aritmética é: " + media);

        scanner.close();
    }
}
