public interface DispositivoI {
    final int MAX_BATTERY = 100;
    final int MIN_BATTERY = 0;

    default void encender(boolean estadoDisp, String nameDisp) {
        if (estadoDisp) {
            System.out.println(nameDisp + ": El dispositivo se esta encendiendo!!!");
        } else {
            System.out.println(nameDisp + ": Disposittivo apagado!!!");
        }
    }

    default void apagar(boolean estadoDisp, String nameDisp) {
        if (estadoDisp) {
            System.out.println(nameDisp + ": Dispositivo se esta apagando!!!");
        } else {
            System.out.println(nameDisp + ": Disposittivo apagado!!!");
        }
    }

    public String cargarBateria(String fuenteVoltaje, double tiempoPrendido);

    default void MostrarResolusion(String resolucion) {
        System.out.println("\nResolucion: " + resolucion);
        System.out.println("||||||||||||||||");
        System.out.println("|              |");
        System.out.println("|              |");
        System.out.println("|  1920x1080   |");
        System.out.println("|              |");
        System.out.println("|              |");
        System.out.println("||||||||||||||||");
    }

    default void MostrarResolusion(String resolucion, String calidad) {
        System.out.println("\nResolucion: " + resolucion);
        System.out.println("\n\t => " + calidad + "<=");
        System.out.println("\t\t||||||||||||||||");
        System.out.println("\t\t|     4K       |");
        System.out.println("\t\t|              |");
        System.out.println("\t\t|  3840x2160   |");
        System.out.println("\t\t|              |");
        System.out.println("\t\t|     4K       |");
        System.out.println("\t\t||||||||||||||||");
    }

    default void MostrarResolusion(String resolucion, String sistemaOperativo, String marcaMovil) {
        System.out.println("\nResolucion: " + resolucion);
        System.out.println("\n  -" + marcaMovil + "-");
        System.out.println("\n  -" + sistemaOperativo + "-");

        System.out.println("\t\t||||||||");
        System.out.println("\t\t|      |");
        System.out.println("\t\t|      |");
        System.out.println("\t\t|      |");
        System.out.println("\t\t||||||||");
    }

    void generarDefault(int value) throws Exception;
}
