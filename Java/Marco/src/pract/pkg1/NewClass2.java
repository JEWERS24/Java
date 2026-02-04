package pract.pkg1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SECCION_DIURNA
 */


import java.util.Scanner;

public class NewClass2 {
    
    public static void main(String[] args) {
    Scanner ac = new Scanner(System.in);
    int suma=0;
    System.out.println("Indique el numero de filas");
    int filas = ac.nextInt();
    System.out.println("Indique el numero de columnas");
    int columnas = ac.nextInt();

    int [][] mac = new int[filas] [columnas];
    int [][] m = new int[filas] [columnas];

    for(int i=0; i<filas; i++)
    {
        for(int j=0; j<columnas; j++)
        {
            System.out.println("Digite el numero");
            mac [i][j]= ac.nextInt();

        }

    }
    for(int i=0; i<filas; i++)
    {
        for(int j=0; j<columnas; j++){
              System.out.println("posicion"  + i + j+  "numero" + mac[i] [j]);
        if  (i==j)

           suma=suma + mac [i][j];
    }
}}}


