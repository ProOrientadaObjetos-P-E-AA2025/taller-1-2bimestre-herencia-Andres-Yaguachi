package ejecutarprestamos;

import java.util.ArrayList;
import java.util.Scanner;

public class EjecutarPrestamos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Arreglos donde guardaremos cada prestamo para imprimirlos al final
        ArrayList<PrestamoEducativo> pE = new ArrayList<>();
        ArrayList<PrestamosAutomovil> pA = new ArrayList<>();
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
        String nivEst;
        double valCarrera;
        //variables prestamo Automovil;
        String tipoAu;
        String marAu;
        double valAu;

        do {
            opc = menu1();
            switch (opc) {
                case 1:
                    if (menu2() == 2) {
                        PrestamoEducativo presEd = new PrestamoEducativo("Grado", 15000, 24, "Loja", "Danny", "Villacorta",
                                "ds-villacorta1@utpl", "Universidad Tecnica Particular de Loja", "UTPL");
                        presEd.calcularvalormensualEducativo();
                        System.out.println(presEd);
                        //Agrego el prestamo al arreglo
                        pE.add(presEd);
                    } else {
                        //Beneficiario
                        System.out.println("\nDatos-Beneficiario:");
                        System.out.print("Ingrese su Nombre: ");
                        nomP = sc.nextLine();
                        System.out.print("Ingrese su Apellido: ");
                        apel = sc.nextLine();
                        System.out.print("Ingrese su User-Name: ");
                        uname = sc.nextLine();
                        System.out.println("-----------------------------------");
                        //Datos Prestamo educativo
                        System.out.println("\nDatos - Prestamo");
                        System.out.print("Ingrese Tiempo de Prestamo (en Meses): ");
                        timPres = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Ingrese la Ciudad(en Mayusculas): ");
                        ciudad = sc.nextLine().toUpperCase();
                        System.out.println("-----------------------------------");
                        //Institucion Educativa;
                        System.out.println("\nDatos-Institucion Educativa");
                        System.out.print("Ingrese el Nombre de la Institucion Educativa: ");
                        nomIns = sc.nextLine();
                        System.out.print("Ingrese las Siglas de la institucion: ");
                        siglas = sc.nextLine();
                        System.out.println("-----------------------------------");
                        //Prestamo educativo 
                        System.out.println("\nDatos- Prestamo - Educativo");
                        System.out.print("Ingrese el Nivel de Estudio: ");
                        nivEst = sc.nextLine();
                        System.out.print("Ingrese el valor de su carrera: ");
                        valCarrera = sc.nextDouble();
                        //Crear el Objeto
                        PrestamoEducativo presEd = new PrestamoEducativo(nivEst, valCarrera, timPres, ciudad, nomP, apel, uname, nomIns, siglas);
                        //calculamos el valor de pago mensual;
                        presEd.calcularvalormensualEducativo();
                        //Imprimimos
                        System.out.println(presEd);
                        //Agrego el prestamo al arreglo
                        pE.add(presEd);
                    }
                    break;
                case 2:
                    if (menu2() == 2) {
                        Persona garante = new Persona("Israel", "Ludena", "is.ludean@utpl");
                        PrestamosAutomovil presAu = new PrestamosAutomovil("Deportivo", "Audi", garante, 250000, 24, "QUITO", "Sebastian", "Yaguachi ", "se.yaguachi");
                        presAu.calcularValorMensual();
                        System.out.println(presAu);
                        pA.add(presAu);
                    } else {
                        //Garante
                        System.out.println("\nDatos-Garante:");
                        System.out.print("Ingrese su Nombre: ");
                        nomP = sc.nextLine();
                        System.out.print("Ingrese su Apellido: ");
                        apel = sc.nextLine();
                        System.out.print("Ingrese su User-Name: ");
                        uname = sc.nextLine();
                        Persona garante = new Persona(nomP, apel, uname);
                        //Beneficiario
                        System.out.println("\nDatos-Beneficiario:");
                        System.out.print("Ingrese su Nombre: ");
                        nomP = sc.nextLine();
                        System.out.print("Ingrese su Apellido: ");
                        apel = sc.nextLine();
                        System.out.print("Ingrese su User-Name: ");
                        uname = sc.nextLine();
                        //Datos Prestamo educativo
                        System.out.println("\nDatos - Prestamo");
                        System.out.print("Ingrese Tiempo de Prestamo (en Meses): ");
                        timPres = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Ingrese la Ciudad(en Mayusculas): ");
                        ciudad = sc.nextLine().toUpperCase();
                        System.out.println("-----------------------------------");
                        System.out.println("\nDatos-Automovil");
                        System.out.print("Ingrese el tipo de Auto:");
                        tipoAu = sc.nextLine();
                        System.out.print("Ingrese la marca del Auto: ");
                        marAu = sc.nextLine();
                        System.out.print("Ingrese el valor del vehiculo: ");
                        valAu = sc.nextDouble();
                        //Creamo el objeto
                        PrestamosAutomovil presAu = new PrestamosAutomovil(tipoAu, marAu, garante, valAu, timPres, ciudad, nomP, apel, uname);
                        presAu.calcularValorMensual();
                        System.out.println(presAu);
                        pA.add(presAu);
                    }
                    break;
            }

        } while (opc != 0);
        System.out.println("\nInforme de todos los prestamos realizados.......\n");
        if (pE.isEmpty()) {
            System.out.println("No se ingreso ningun Prestamo Educativo");
        } else {
            System.out.println("PRESTAMOS-EDUCATIVOS");
            for (int i = 0; i < pE.size(); i++) {
                System.out.println(pE.get(i));
            }
        }
        if (pA.isEmpty()) {
            System.out.println("No se ingreso ningun Prestamo de Automovil");
        } else {
            System.out.println("PRESTAMOS-Automoviles");
            for (int i = 0; i < pA.size(); i++) {
                System.out.println(pA.get(i));
            }
        }

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
