package AULA_24_4;

import java.util.Scanner;

class CalcTemp {
    static double tempF;
}

public class index {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a temperatura em Fahrenheit: ");
        double responseInput = input.nextDouble();
        CalcTemp.tempF = calculate(responseInput);
        System.out.println("A temperatura em Celsius é: " + CalcTemp.tempF);
        input.close();
    }

    public static double calculate (double num1) {
        double result =  0.5555555555555556 * (num1 - 32);
        return result;
    }
    
}



