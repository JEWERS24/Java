/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joele
 */
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        int[][] matriz = {{2, 3, 4},
                          {6, 8, 9},
                          {10, 2, 3}};
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][i];
        }
        System.out.println("La suma de la diagonal es: " + suma);
    }
}
        
