package Enums.Gestion_de_estaciones.enums;

public enum Mes {
    ENERO(1),
    FEBRERO(2),
    MARZO(3),
    ABRIL(4),
    MAYO(5),
    JUNIO(6),
    JULIO(7),
    AGOSTO(8),
    SEPTIEMBRE(9),
    OCTUBRE(10),
    NOVIEMBRE(11),
    DICIEMBRE(12);

    private int numero;

    private Mes(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public static Mes obtenerMes(int numero) {
        for (Mes mes : Mes.values()) {
            if (mes.getNumero() == numero) {
                return mes;
            }
        }
        return null;
    }
}
