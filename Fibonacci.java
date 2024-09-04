package Desafio;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número para verificar se pertence à sequência de Fibonacci: ");
        int numero = scanner.nextInt();

        if (pertenceAFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " NÃO pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }

    public static boolean pertenceAFibonacci(int valor) {
        if (valor < 0) return false;

        int fib1 = 0;
        int fib2 = 1;

        while (fib1 <= valor) {
            if (fib1 == valor) {
                return true;
            }
            int proximoFib = fib1 + fib2;
            fib1 = fib2;
            fib2 = proximoFib;
        }
        return false;
    }
}
