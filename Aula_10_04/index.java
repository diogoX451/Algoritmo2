package Aula_10_04;

import java.util.Scanner;

public class index {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Informe os dias");
    int dias =  sc.nextInt();
    int temperatura = 0;
    int menor=0;
    int maior = 0;
    int media[] = new int[121];

    for (int i = 0; i < dias; i++ ){
        System.out.print("Informe a temperatura do dia " + i + ": ");
        temperatura = sc.nextInt();
        media[i] = temperatura;
       if (temperatura < menor){
           menor = temperatura;
       }
        if (temperatura > maior){
              maior = temperatura;
         }
    }
    int soma = 0;
    int result = 0;
    for (int i = 0; i <= dias; i++ ){
        soma += media[i];
        result = soma / dias;
    }

    System.out.println("A média das temperaturas foi: " + result);
    System.out.println("A menor temperatura foi: " + menor);
    System.out.println("A maior temperatura foi: " + maior);
    sc.close();
 }   
 
}
