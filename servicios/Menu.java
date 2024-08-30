package Enums.Gestion_de_estaciones.servicios;

import java.util.Scanner;

import Enums.Gestion_de_estaciones.enums.Estacion;
import Enums.Gestion_de_estaciones.enums.Mes;

public class Menu {
    public static void mostrarMenu() {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú de Opciones ---");
            System.out.println("1. Mostrar meses correspondientes a cada estación");
            System.out.println("2. Determinar estación por mes");
            System.out.println("0. Salir");
            System.out.println("Ingrese una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    EstacionDelAño.imprimirEstaciones();
                    break;
                case 2:
                    System.out.println("Ingrese el número del mes: ");
                    int mesNumero = sc.nextInt();
                    Mes mes = Mes.obtenerMes(mesNumero);
                    
                    if (mes != null) {
                        Estacion estacion = EstacionDelAño.obtenerEstacion(mes);
                        System.out.println("El mes " + mes + " corresponde a la estación: " + estacion);
                    } else {
                        System.out.println("Numero del mes no válido.");   
                    }
                    break;
                case 0:
                    System.out.println("Adiós.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 0);
        sc.close();
    }

}
