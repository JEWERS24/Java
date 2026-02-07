package pract.pkg1;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SECCION_DIURNA
 */
public class NewClass1 {
      public static void main(String[]  args) {
        Scanner ac  = new Scanner(System.in);
        System.out.println("Indique el tamaño del vector");
        int tam = ac.nextInt();
       int [ ] vect_1 = new int [tam];
       int suma=0;
       for (int i=0;  i<tam; i++){
        System.out.println("Digite el número");
        vect_1[i]=ac.nextInt();
        
        
        
 
            
}
              for (int i=0;  i<tam; i=i+2){
       // System.out.println(vect_1[i]);
        
        System.out.println("posicion"  + i +  "numero" + vect_1[i]);
 
         suma = suma+ vect_1[i];
              
    }
              System.out.println("El resultado es " + suma);
}  
}
 