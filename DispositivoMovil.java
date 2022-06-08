public class DispositivoMovil implements DispositivoI {
    double maxTiempoG = 12.0;

    @Override
    public String cargarBateria(String fuenteVoltaje, double tiempoPrendido) {
        int porcentageConsumido = (int) (tiempoPrendido * 100 / maxTiempoG);
        int porcentBat = 100 - porcentageConsumido;
        String barrita = "";
        if (porcentBat > 75) {
            barrita = "[oooo]";
        } else if (porcentBat > 50 && porcentBat <= 75) {
            barrita = "[ooo ]";
        } else if (porcentBat > 25 && porcentBat <= 50) {
            barrita = "[oo  ]";
        } else if (porcentBat > 5 && porcentBat <= 25) {
            barrita = "[o   ]";
        } else {
            barrita = "[    ]";
        }

        return "Bateria: " + fuenteVoltaje + " " + porcentBat + "%" + " ¬" + barrita + "¬";
    }

    @Override
    public void generarDefault(int value) throws Exception {
        System.out.println("Generando default - null");
    }

}
