package pract.pkg1;

import java.util.Scanner;

public class Practica_2 {


    public static void main(String[] args) {
    Scanner ac = new Scanner(System.in);
    System.out.println("Indique el numero de filas");
    int filas = ac.nextInt();
    System.out.println("Indique el numero de columnas");
    int columnas = ac.nextInt();

    int [][] mac= new int[filas] [columnas];

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
        for(int j=0; j<columnas; j++)
              System.out.println("posicion"  + i + j+  "numero" + mac[i] [j]);
}}}