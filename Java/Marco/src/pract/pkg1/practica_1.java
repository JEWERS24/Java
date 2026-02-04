package pract.pkg1;


import java.util.Scanner;


public class practica_1 {
    public static void main(String[] args) {
    Scanner ac = new Scanner(System.in);
    System.out.println("Indique el tamaño del vector");
    int m = ac.nextInt();
    // vect_1 = new int[tam];
    int suma = 0;
    int vect_1[] = new int[m];
    
    for(int i=0; i<m; i++){
        System.out.println("Digite el numero");
        vect_1[1] = ac.nextInt();
    }
    
    for(int i=0; 1<m; i=1+2){
    System.out.println("posicion " + i + "numero " + vect_1[1]);
    suma = suma + vect_1[i];
    }
    System.out.println("el resultado es " + suma);
    
    }
}
