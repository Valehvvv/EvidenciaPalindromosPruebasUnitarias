package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una palabra");
        String palabra = sc.nextLine();
        boolean esPalindromo = esPalindromo(palabra);

        if (esPalindromo) {
            System.out.println("la cadena es palindroma");
        } else {
            System.out.println("la cadena no es palindroma");
        }
        sc.close();
    }

    public static boolean esPalindromo(String palabra){
        String resultado = "";

        resultado = new StringBuilder(palabra).reverse().toString();
        return palabra.equals(resultado);
    }
}