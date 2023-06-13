
package Fatorial;

import java.util.Scanner;

class Fatorial {
// Nome : Diogo Almeida, Fernanda Ribeiro
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Informe um numero para descobri fatorial");
            int numero = scan.nextInt();
            int calcFatorial = calcFatorial(numero);
            System.out.println("Fatorial: " + calcFatorial);
            if(isPrimo(numero)){
                System.out.println(numero + " É primo");
            } else{
                System.out.println(numero + " Não é Primo");
            }
            if(isPerfect(numero)){
                System.out.println(numero + " É perfeito");
            } else{
                System.out.println(numero + " Não é perfeito");
            }
        }
        scan.close();
    }

    static boolean isPerfect(int numero) {
        if (numero <= 1)
            return false;

        int numPerfect = 1;

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                numPerfect += i;
            }
        }

        if (numPerfect == numero) {
            return true;
        }
        return false;
    }

    static boolean isPrimo(int numero) {
        if(numero <= 1){
            return false;
        }
        boolean isPrimo = true;
        for (int aux = numero - 1; aux > 1; aux--) {
            if (numero % aux == 0) {
                isPrimo = false;
            }
        }
        return isPrimo;
    }

    static int calcFatorial(int numero) {
        if (numero != 0) {
            for (int varTemporay = numero; varTemporay > 1; varTemporay--) {
                numero *= varTemporay;
            }

        } else {
            numero = 1;
        }
        return numero;
    }
}