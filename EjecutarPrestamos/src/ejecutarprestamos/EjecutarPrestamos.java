package ejecutarprestamos;

import java.util.Scanner;

public class EjecutarPrestamos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            
        } while( );
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
        System.out.println("[1] si");
        System.out.println("[2] no");
        System.out.println("[0] Salir");
        return sc.nextInt();
    }
}
