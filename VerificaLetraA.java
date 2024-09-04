package Desafio;

import java.util.Scanner;

public class VerificaLetraA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe uma string para verificar a ocorrência da letra 'a': ");
        String entrada = scanner.nextLine();

        int contador = contarOcorrenciasDeA(entrada);

        if (contador > 0) {
            System.out.println("A letra 'a' aparece " + contador + " vezes na string.");
        } else {
            System.out.println("A letra 'a' não aparece na string.");
        }

        scanner.close();
    }

    public static int contarOcorrenciasDeA(String str) {
        int count = 0;

        for (char c : str.toCharArray()) {
            if (c == 'a' || c == 'A') {
                count++;
            }
        }

        return count;
    }
}
