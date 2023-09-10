package org.example;
import java.util.Scanner;

public class Main {

    public static boolean esPalindromo(String cadena) {
        cadena = cadena.toLowerCase().replaceAll("\\s+", "");
        String palabraInicial = cadena;

        String[] caracteres = palabraInicial.split("");
        StringBuilder reverso = new StringBuilder();
        for (int i = caracteres.length - 1; i >= 0; i--) {
            reverso.append(caracteres[i]);
        }

        String palabraFinal = reverso.toString();

        return palabraInicial.equals(palabraFinal);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una cadena de texto: ");
        String cadena = scanner.nextLine();
        scanner.close();

        boolean esPalindromo = esPalindromo(cadena);

        if (esPalindromo) {
            System.out.println(" es un palíndromo.");
        } else {
            System.out.println(" no es un palíndromo.");
        }
    }
}
