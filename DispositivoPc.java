public class DispositivoPc implements DispositivoI {

    @Override
    public String cargarBateria(String fuenteVoltaje, double tiempoPrendido) {

        return "Cable: " + fuenteVoltaje + " Fuente continua conectada  [oooooo]  ";
    }

    @Override
    public void generarDefault(int value) throws Exception {
        if (value >= 5) {
            System.out.println("Cargando..");
        } else {
            System.out.println("Error!!");
            throw new Exception("No soporta la memoria!!  |-_-|");
        }
    }

}
