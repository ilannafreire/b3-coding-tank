package exercicios;

import java.util.Scanner;

public class DivisaoNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        if (num2 == 0) {
            System.out.println("Erro: divisão por zero não é permitido");
        } else {
            double resultado = num1 / num2;
            System.out.println("O resultado da divisão é: " + resultado);
        }
        scanner.close();
    }
}
