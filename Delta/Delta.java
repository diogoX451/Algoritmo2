package Delta;

import java.util.Scanner;

public class Delta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de A");
        Integer A = sc.nextInt();
        System.out.println("Digite o valor de  B");
        Integer B = sc.nextInt();
        System.out.print("Digite o valor de C");
        Integer C = sc.nextInt();
        Integer result = calculaDelta(A, B, C);
        System.out.println("Este é o Delta" +  result);
        
        if(result < 0){
            System.out.println("O valor de Delta não exite");
            System.exit(0);
        }

        calcularRaizes(result, A, B);

        sc.close();
    }

    static Integer calculaDelta(Integer A, Integer B, Integer C){
        // Integer delta = (int) Math.pow(B, 2)  -  (4 * A * C); // Um metodo
        Integer delta = (B  * B) - (4 * A  *C);
        
        return delta;
    }

    static void calcularRaizes(Integer numero, Integer A,  Integer B){
        int x1 = (int) (-B + Math.sqrt(numero))  / (2 * A);
        int x2 = (int) (-B - Math.sqrt(numero)) / (2 * A);
        System.out.println("Raises X1: " + x1 + "" + " Raizes X2: " + x2);
    }
}
