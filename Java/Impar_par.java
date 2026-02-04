package impar_par;

    import java.util.Scanner;

public class Impar_par {

    
    public static void main(String[] args) {
       Scanner ac = new Scanner(System.in);
       System.out.println("Indique la cantidad de numeros");
       int cant = ac.nextInt();
       for(int i=0; i<cant; i++){
       System.out.println("Digite el numero");
       int num = ac.nextInt(); 
       if (num %2 == 0) {
           System.out.println("El numero es par");
       }
       else {
               System.out.println("El numero es impar ");
               }
           
       }
            
        }
           }   
   


