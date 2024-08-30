package Enums.Gestion_de_estaciones.servicios;

import Enums.Gestion_de_estaciones.enums.Estacion;
import Enums.Gestion_de_estaciones.enums.Mes;

public class EstacionDelAño {
    public static Estacion obtenerEstacion (Mes mes){
        switch (mes) {
            case DICIEMBRE:
            case ENERO:
            case FEBRERO:
                return Estacion.VERANO;
            case MARZO:
            case ABRIL:
            case MAYO:
                return Estacion.OTOÑO;
            case JUNIO:
            case JULIO:
            case AGOSTO:
                return Estacion.INVIERNO;
            case SEPTIEMBRE:
            case OCTUBRE:
            case NOVIEMBRE:
                return Estacion.PRIMAVERA;
            default:
                throw new IllegalArgumentException("Mes no válido: " + mes);
        }
    }

    public static void imprimirEstaciones(){
        System.out.println("\nPrimavera: Septiembre, Octubre, Noviembre");
        System.out.println("Verano: Diciembre, Enero, Febrero");
        System.out.println("Otoño: Marzo, Abril, Mayo");
        System.out.println("Invierno: Junio, Julio, Agosto");
    }
}
