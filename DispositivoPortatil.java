public class DispositivoPortatil implements DispositivoI {
    private double maxTiempoG = 24.0;
    private boolean tarjetaGrafica = false;
    private boolean integraSSD = false;
    private boolean integraHDD = false;

    public boolean isTarjetaGrafica() {
        return tarjetaGrafica;
    }

    public void setTarjetaGrafica(boolean tarjetaGrafica) {
        this.tarjetaGrafica = tarjetaGrafica;
    }

    public boolean isIntegraSSD() {
        return integraSSD;
    }

    public void setIntegraSSD(boolean integraSSD) {
        this.integraSSD = integraSSD;
    }

    public boolean isIntegraHDD() {
        return integraHDD;
    }

    public void setIntegraHDD(boolean integraHDD) {
        this.integraHDD = integraHDD;
    }

    @Override
    public String cargarBateria(String fuenteVoltaje, double tiempoPrendido) {
        double tiempoRestante = (maxTiempoG - tiempoPrendido);
        int porcentageConsumidoSolo = (int) (tiempoPrendido * 100 / maxTiempoG);

        if (tarjetaGrafica) {
            tiempoRestante = tiempoRestante / 1.2;
        }
        if (integraSSD) {
            tiempoRestante = tiempoRestante / 1.15;
        }
        if (integraHDD) {
            tiempoRestante = tiempoRestante / 1.1;
        }
        int porcentageConsuMasHardw = (int) (tiempoRestante * 100 / maxTiempoG);
        return "Bateria:\n " + fuenteVoltaje + " \n Optimizado: " + porcentageConsuMasHardw + "%" + " -> Real: ¬" + "["
                + porcentageConsumidoSolo + "%]¬\nJugetes:\n-Tarjeta grafica=" + tarjetaGrafica + "\n-Integra SSD="
                + integraSSD + "\n-Integra HDD=" + integraHDD;
    }

    @Override
    public void generarDefault(int value) throws Exception {
        System.out.println("Generando default - null");

    }

}
