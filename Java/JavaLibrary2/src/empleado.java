//Importamos las librerias necesarias

import java.util.Scanner;

//Clase publica "empleado"
public class empleado {

    private static String nom;
    private static String ape;
    private static int ced;
    private static int num;
    private static String ceds;
    private static String nums;
    private static int i = 0;

    public static void main(String[] args) {
        //Scanner de texto
        Scanner op = new Scanner(System.in);
        //Datos del usuario
        System.out.print("Digite el nombre: ");
        nom = op.next();
        while (nom.length() < 4 || nom.matches("\\d+") || !nom.matches("[a-zA-Z]+")) {
            System.out.println("Digite un nombre real. No debe contener numeros");
            System.out.print("Digite el nombre: ");
            nom = op.next();
        }
        while (nom.matches("[a-zA-Z]+")) {
            System.out.print("Digite el apellido: ");
            ape = op.next();

            while (ape.length() < 4 || ape.matches("\\d+") || !ape.matches("[a-zA-Z]+")) {
                System.out.println("Digite un apellido real. No debe contener numeros");
                System.out.print("Digite el apellido: ");
                ape = op.next();
            }
            while (ape.matches("[a-zA-Z]+")) {
                System.out.print("Digite su cedula: ");
                ced = op.nextInt();
                ceds = Integer.toString(ced);

                while (ceds.length() < 9 || ceds.matches("[a-zA-Z]+") || !ceds.matches("\\d+")) {
                    System.out.println("La cedula debe contener 9 digitos. No puede contener letras.");
                    System.out.print("Digite su cedula: ");
                    ced = op.nextInt();
                    ceds = Integer.toString(ced);
                }
                while (ceds.length() > 9 || ceds.matches("[a-zA-Z]+") || !ceds.matches("\\d+")) {
                    System.out.println("La cedula no debe contener mas de 9 digitos. No puede contener letras");
                    System.out.print("Digite su cedula: ");
                    ced = op.nextInt();
                    ceds = Integer.toString(ced);
                }
                if (ceds.length() == 9) {
                    System.out.print("Digite el numero del telefono: ");
                    num = op.nextInt();
                    nums = Integer.toString(num);

                    while (nums.length() < 8 || nums.matches("[a-zA-Z]+") || !nums.matches("\\d+")) {
                        System.out.println("El numero no puede contener menos de 8 digitos. No puede contener letras");
                        System.out.print("Digite el numero del telefono: ");
                        num = op.nextInt();
                        nums = Integer.toString(num);
                    }
                    while (nums.length() > 8 || nums.matches("[a-zA-Z]+") || !nums.matches("\\d+")) {
                        System.out.println("El numero no puede contener mas de 8 digitos. No puede contener letras");
                        System.out.print("Digite el numero del telefono: ");
                        num = op.nextInt();
                        nums = Integer.toString(num);
                    }
                    if (nums.length() == 8) {
                        String matt[] = {nom, ape, ceds, nums};
                        int salario;
                        int[] vector = new int[7];
                        int aa = 0;
                        while (i < 7) {
                            int dias = 0;
                            int norm = 1500;
                            int extr1 = 3000;
                            int extr2 = 9500;
                            int salarnorm = 0;
                            int salarex1 = 0;
                            int salarex2 = 0;
                            int ent, sal, entex1, salex1, entex2, salex2 = 0;
                            //horario laboral normal
                            if (i == 0) {
                                String day = "Lunes";
                                System.out.println("Horario normal " + day + "(Máximo 8 horas)");
                            } else if (i == 1) {
                                String day = "Martes";
                                System.out.println("Horario normal " + day + "(Máximo 8 horas)");
                            } else if (i == 2) {
                                String day = "Miercoles";
                                System.out.println("Horario normal " + day + "(Máximo 8 horas)");
                            } else if (i == 3) {
                                String day = "Jueves";
                                System.out.println("Horario normal " + day + "(Máximo 8 horas)");
                            } else if (i == 4) {
                                String day = "Viernes";
                                System.out.println("Horario normal " + day + "(Máximo 8 horas)");
                            } else if (i == 5) {
                                String day = "Sábado";
                                System.out.println("Horario normal " + day + "(Máximo 8 horas)");
                            } else if (i == 6) {
                                String day = "Domingo";
                                System.out.println("Horario normal " + day + "(Máximo 8 horas)");
                            }
                            System.out.println("------------------------------------------------------------------------------------------------------");
                            System.out.println("Utilice el horario militar si pasa despúes de las 12md");
                            System.out.println("Si no trabajo ninguna hora, digite 0");
                            System.out.println("------------------------------------------------------------------------------------------------------");
                            System.out.print("A que horas entró: ");
                            ent = op.nextInt();
                            while (ent < 7 && ent > 1) {
                                System.out.println("El horario no permite entrar antes de las 6");
                                System.out.print("A que horas entró: ");
                                ent = op.nextInt();
                            }
                            while (ent >= 16) {
                                System.out.println("El horario no permite entrar a las 4pm(16hrs)");
                                System.out.print("A que horas entró: ");
                                ent = op.nextInt();
                            }
                            if (ent >= 7 || ent == 0) {
                                System.out.print("A que horas salió: ");
                                sal = op.nextInt();
                                while (sal > 16) {
                                    System.out.println("El horario no permite salir despues de las 4pm(16hrs). Utlice las extras si trabajó despues de las 4pm(16hrs)");
                                    System.out.print("A que horas salió: ");
                                    sal = op.nextInt();
                                }
                                while (sal <= 7 && sal > 0) {
                                    System.out.println("El horario no permite salir antes de las 7am(7hrs)");
                                    System.out.print("A que horas salió: ");
                                    sal = op.nextInt();
                                }
                                int hours = sal - ent;
                                salarnorm = hours * norm;
                            }

                            //extras 1
                            System.out.println("------------------------------------------------------------------------------------------------------");
                            System.out.println("Horas extras");
                            System.out.print("A que horas entró: ");
                            entex1 = op.nextInt();
                            while (entex1 < 16 && entex1 > 0) {
                                System.out.println("Las extras no pueden ser antes de las 4pm(16hrs)");
                                System.out.print("A que horas entró: ");
                                entex1 = op.nextInt();
                            }
                            while (entex1 == 22) {
                                System.out.println("Las extras no pueden empezar a las 10pm(22hrs)");
                                System.out.print("A que horas entró: ");
                                entex1 = op.nextInt();
                            }
                            if (entex1 >= 16 || entex1 == 0) {
                                System.out.print("A que horas salió: ");
                                salex1 = op.nextInt();
                                while (salex1 > 22) {
                                    System.out.println("Las extras 1 no permiten salir despúes de las 10pm(22hrs). Utilice las extras 2 si salió despúes de las 10pm(22hrs)");
                                    System.out.print("A que horas salió: ");
                                    salex1 = op.nextInt();
                                }
                                while (salex1 <= 16 && salex1 > 0) {
                                    System.out.println("Las extras 1 no permiten salir antes de las 4pm(16hrs).");
                                    System.out.print("A que horas salió: ");
                                    salex1 = op.nextInt();
                                }
                                int hoursex1 = salex1 - entex1;
                                salarex1 = hoursex1 * extr1;
                            }

                            //extras 2
                            System.out.println("------------------------------------------------------------------------------------------------------");
                            System.out.println("Horas extras 2");
                            System.out.print("A que horas entró: ");
                            entex2 = op.nextInt();
                            while (entex2 < 22 && entex2 > 0) {
                                System.out.println("Las extras no pueden ser antes de las 10pm(22hrs)");
                                System.out.print("A que horas entró: ");
                                entex2 = op.nextInt();
                            }
                            while (entex2 == 24) {
                                System.out.println("Las extras no pueden empezar a las 12am(24hrs)");
                                System.out.print("A que horas entró: ");
                                entex2 = op.nextInt();
                            }
                            if (entex2 >= 22 || entex2 == 0) {
                                System.out.print("A que horas salió: ");
                                salex2 = op.nextInt();
                                while (salex2 > 24) {
                                    System.out.print("Las extras no permiten salir despúes de las 12am(24hrs)");
                                    System.out.print("A que horas salió: ");
                                    salex2 = op.nextInt();
                                }
                                while (salex2 <= 22 && salex2 > 0) {
                                    System.out.print("Las extras no permiten salir antes de las 10pm(22hrs)");
                                    System.out.print("A que horas salió: ");
                                    salex2 = op.nextInt();
                                }
                                int hoursex2 = salex2 - entex2;
                                salarex2 = hoursex2 * extr2;
                            }
                            dias = salarnorm + salarex1 + salarex2;
                            for (int k = 0; k < vector.length; k++) {
                                if (k == 6) {
                                    vector[k] = dias * 2;
                                } else {
                                    vector[k] = dias;
                                }

                            }
                            System.out.println("------------------------------------------------------------------------------------------------------");
                            i++;
                        }
                        System.out.println("------------------------------------------------------------------------------------------------------");
                        for (int i = 0; i < vector.length; i++) {
                            aa += vector[i];
                        }
                        System.out.println("El salario de dicha semana fue de: " + aa);
                        System.out.println("------------------------------------------------------------------------------------------------------");
                        System.out.println("Informe del trabajador");
                    }
                }
            }

        }

    }
}
