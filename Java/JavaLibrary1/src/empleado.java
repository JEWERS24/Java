import java.util.Scanner;
import java.util.*;


public class empleado {
    public static void main(String[] args){
        Scanner op = new Scanner(System.in);
        System.out.print("Digite el nombre: ");
        String nom = op.next();
        System.out.print("Digite el apellido: ");
        String ape = op.next();
        System.out.print("Digite su cedula: ");
        int ced = op.nextInt();
        String ceds = Integer.toString(ced);
        System.out.print("Digite el numero del telefono: ");
        int num = op.nextInt();
        String nums = Integer.toString(num);
        String matt[] = {nom, ape, ceds, nums};
        int salario;
        Vector v = new Vector();
        for(int i=0;i<7;i++){
            int dias = 0;
            int norm = 1500;
            int salarnorm = 0;
            int salarex1 = 0;
            int salarex2 = 0;
            System.out.println("Horario normal");
            System.out.print("A que horas entró: ");
            int ent = op.nextInt();
            if(ent < 7){
                System.out.println("El horario no permite entrar antes de las 6");
            }
            else if(ent == 16){
                System.out.print("El horario no permite entrar a las 4pm(16)");
            }
            if(ent > 7){
                System.out.print("A que horas salió: ");
                int sal = op.nextInt();
            }
            int hours = sal-ent;
            salarnorm = hours*norm;
            
            int extr1 = 3000;
            System.out.print("Horas extras");
            System.out.print("A que horas entró: ");
            int entex1 = op.nextInt();
            System.out.print("A que horas salió: ");
            int salex1 = op.nextInt();
            if(entex1 < 16){
                System.out.print("Las extras no pueden ser antes de las 4pm(16)");
            }
            else if(entex1 == 22){
                System.out.print("Las extras no pueden ser a las 10pm(22)");
            }
            int hoursex1 = salex1-entex1;
            salarex1 = hoursex1*extr1;
            
            int extr2 = 9500;
            System.out.print("Horas extras 2");
            System.out.print("A que horas entró: ");
            int entex2 = op.nextInt();
            System.out.print("A que horas salió: ");
            int salex2 = op.nextInt();
            if(entex2 < 22){
                System.out.print("Las extras no pueden ser antes de las 10pm(22)");
            }
            else if(entex2 == 24){
                System.out.print("Las extras no pueden ser a las 12am(24)");
            }
            int hoursex2 = salex2-entex2;
            salarex2 = hoursex2*extr2;
            
            dias = salarnorm + salarex1 + salarex2;
            
            v.add(dias);
        }
                
                
                
                
    }      
}