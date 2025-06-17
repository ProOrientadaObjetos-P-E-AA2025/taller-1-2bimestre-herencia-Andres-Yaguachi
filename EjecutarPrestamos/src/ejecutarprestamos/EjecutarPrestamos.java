package ejecutarprestamos;

import java.util.Scanner;

public class EjecutarPrestamos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc;
        //variables persona;
        String nomP;
        String apel;
        String uname;
        //variables Inseduc;
        String nomIns;
        String siglas;
        //variables prestamo
        int timPres;
        String ciudad;
        //variables Prestamo educativo
        String nivelEstudio;
        double valorCarrera;
        double valormensualPrestamoedu;
        //variables prestamo Automovil;
        String tipoAutomovil;
        String marcaAutomovil;
        double valorAutomovil;
        double valorMensual;

        do {
            opc = menu1();
            switch (opc) {
                case 1:
                    if (menu2() == 2) {

                    } else {
                        //Beneficiario
                        System.out.println("\nIngreso de Datos-Beneficiario:");
                        System.out.print("Ingrese su Nombre: ");
                        nomP = sc.nextLine();
                        System.out.print("Ingrese su Apellido: ");
                        apel = sc.nextLine();
                        System.out.print("Ingrese su User-Name: ");
                        uname = sc.nextLine();
                        System.out.println("-----------------------------------");
                        //Institucion Educativa;
                        System.out.println("\nIngreso de Datos-Institucion Educativa");
                        System.out.print("Ingrese el Nombre de la Institucion Educativa: ");
                        nomIns = sc.nextLine();
                        System.out.print("Ingrese las Siglas de la institucion: ");
                        siglas = sc.nextLine();
                        //Datos Prestamo educativo
                        
                    }
                    break;
                case 2:
                    if (menu2() == 2) {

                    } else {

                    }
                    break;

            }

        } while (opc != 0);
    }

    public static int menu1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nMenu Principal");
        System.out.println("[1] Prestamo Educativo");
        System.out.println("[2] prestamo de Automovil");
        System.out.println("[0] Salir");
        return sc.nextInt();
    }

    public static int menu2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nDesea ingresar datos por teclado? ");
        System.out.println("[1] Si");
        System.out.println("[2] No");
        System.out.println("[0] Regresar");
        return sc.nextInt();
    }
}
