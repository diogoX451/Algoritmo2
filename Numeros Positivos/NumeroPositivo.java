import java.util.Scanner;

class Numero {
    int n;
}

public class NumeroPositivo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int aux = 0;
        Numero num1 = new Numero();
        Numero num2 = new Numero();
        Numero num3 = new Numero();

        System.out.print("Insira o Primeiro numero");
         num1.n = sc.nextInt();
        System.out.print("Insira o Segundo numero");
         num2.n = sc.nextInt();
        System.out.print("Insira o Terceiro numero");
         num3.n = sc.nextInt();

        if(num2.n  < num3.n){
            troca(num2, num3);
        }
        
        if(num3.n < num2.n && num3.n < num1.n){
            troca(num1, num3);
        } else if(num2.n < num1.n && num2.n < num3.n){
          troca(num1, num2);
        }


        System.out.println(num1.n + " " + num2.n + " " + num3.n + " ");

        sc.close();
    }

    private static void troca(Numero x, Numero y){
           int aux;
           aux = x.n;
         x.n = y.n;
         y.n = aux;
    }
    
}
