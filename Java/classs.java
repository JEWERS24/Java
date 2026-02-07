import java.util.Scanner;
import java.util.Random;

class dias {
	private final String nombre;

	public dias(String nombre) {
		this.nombre = nombre;
	}
}

public class classs {
    public static void main(String[] args){
        int re,res;
        Random r1 = new Random();
        dias[] sem = new dias[7];
        sem[0] = new dias("Lunes");
	sem[1] = new dias("Martes");
        sem[2] = new dias("Miercoles");
	sem[3] = new dias("Jueves");
        sem[4] = new dias("Viernes");
	sem[5] = new dias("Sábado");
        sem[6] = new dias("Domingo");
        Scanner op = new Scanner(System.in);
        System.out.println("1. Placas");
        System.out.println("2. DECRAT");
        System.out.println("3. Citas DECRAT");
        System.out.println("4. Salir");
        System.out.println("Digite la opción: ");
        int opss = op.nextInt();
        switch (opss){
            case 1 -> {
                System.out.print("Digite su numero de placa: ");
                int opes = op.nextInt();
                if(opes < 100000 | opes > 999999){
                    System.out.println("¡Digite una placa real!");
                }else
                {
                    re=opes/100000000;
                    res=opes%10;
                    if(res % 2 == 0){
                        System.out.println("Su último digito es:" + res + " por lo cual puede transitar los días: Lunes, Miercoles, Viernes y Domingos");
                    }
                    else{
                        System.out.println("Su último digito es:" + res + " por lo cual puede transitar los días: Martes, Jueves, Sábado y Domingos");
                    }

                }
            }
            case 2 -> {
                System.out.println("Listo");
            }
            
            
            case 3 -> {
                System.out.print("Digite su numero de placa: ");
                int ope = op.nextInt();
                int n1 = r1.nextInt(7);
                if(ope < 000001 | ope > 999999){
                    System.out.println("¡Digite una placa real!");
                }
                else
                {
                    re=ope/100000000;
                    res=ope%10;
                    System.out.println("Su último digito es:" + res);
                    System.out.println("Su cita sera programada para el dia " + " del año 2023");
                }
            }
            case 4 -> {
                break;
            }
        }
    }
}
