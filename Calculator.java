import java.util.*;
public class Calculator{
    static Scanner scan = new Scanner(System.in);
      //Alexandra
    public static void main (String [] args){
        int x,y;
        System.out.println("Numero 1: ");
        x = scan.nextInt();
        System.out.println("Numero 2: ");
        y = scan.nextInt();
        sumar(x,y);
        sub(x, y);
        mul(x, y);
        div(x, y);
        mod(x, y);

    }

    public static int sumar(int a, int b){
        System.out.print("La suma es: "+(a+b));
        return 0;
    }
  
    //Paul
    public static int sub(int a, int b){
      System.out.println("La resta de ambos numeros es: " + (a-b)); 
      return 0; 
    }

    public static int mul(int a, int b){
      System.out.println("El resultado de la multiplicación es: " + (a*b)); 
      return 0; 
    }
    
    public static int div (int a, int b){
      double d = (double)(a/b);
      System.out.println("Resultado: "+ d);
      return 0;
    }
    public static int mod (int a, int b){
      System.out.println("Resultado: "+(a%b));
      return 0;
    }
  }

