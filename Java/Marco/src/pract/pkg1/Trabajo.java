package pract.pkg1;
import java.util.Scanner;

public class Trabajo {
    
    public static void main(String[] args){
        int ope = 0;
        int A, B, C;
        Scanner op = new Scanner(System.in);
        System.out.print("(1) Suma");
        System.out.println();
        System.out.print("(2) Resta");
        System.out.println();
        System.out.print("(3) División");
        System.out.println();
        System.out.print("(4) Multiplicación");
        System.out.println();
        System.out.print("--------------------------------------------");
        System.out.println();
        System.out.print("Digite una opción: ");
        ope = op.nextInt();
        System.out.println();
        System.out.print("--------------------------------------------");
        System.out.println();
        System.out.print("Digite el primer número: ");
        A = op.nextInt();
        System.out.print("Digite el Segundo número: ");
        B = op.nextInt();
        System.out.println();
        System.out.print("--------------------------------------------");
        System.out.println();
        switch(ope){
            case 1:
                C = A + B;
                System.out.print("La suma de los digitos es: " + C +" ");
            break;
            case 2:
                C = A - B;
                System.out.print("La resta de los digitos es: " + C +" ");
            break;
            case 3:
                C = A / B;
                System.out.print("La division de los digitos es: " + C +" ");
            break;
            case 4:
                C = A * B;
                System.out.print("La multiplicación de los digitos es: " + C +" ");
            break;
        }
    }
}
