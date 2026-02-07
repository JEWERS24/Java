package pract.pkg1;
import java.util.Scanner;

public class Prueba {
    
    public static void main(String[] args){
        int A, B, C, D;
        int  cont  =  1;
        Scanner op = new Scanner(System.in);
        System.out.print("¿Cuantas veces desea que se ejecute el programa?: ");
        D  = op.nextInt();
        System.out.println();
        System.out.print("--------------------------------------------");
        System.out.println();
        while(cont <= D){
            System.out.print("Digite el primer numero: ");
            A  = op.nextInt();
            System.out.print("Digite el segundo numero: ");
            B = op.nextInt();

            C = A + B;
            System.out.print("El resultado de la suma es: " +  C + " ");
            if(C > 18){
                System.out.print("Mayor de edad");
            }
            else{
                System.out.print("Menor de edad");
            }
            System.out.println();
            System.out.print("--------------------------------------------");
            System.out.println();
        cont = cont +1;
        }
        
        
    }
    
}
