public class MainTarea {

    public static void main(String[] args) throws Exception {
        System.out.println("\n------------- Portatil ----------------");
        DispositivoPortatil dp = new DispositivoPortatil();
        dp.encender(true, "Portatil");
        dp.apagar(false, "Portatil");
        dp.setTarjetaGrafica(true);
        dp.setIntegraSSD(false);
        dp.setIntegraHDD(true);
        System.out.println(dp.cargarBateria("Fuente de 16V", 6.50));
        dp.MostrarResolusion("1920x1080");

        System.out.println("\n------------- Movil ----------------");
        DispositivoMovil dm = new DispositivoMovil();
        dm.encender(true, "Movil");
        dm.apagar(false, "Movil");
        System.out.println(dm.cargarBateria("Fuente de 9V", 5.50));
        dm.MostrarResolusion("400x300", "Android", "Sangung");

        System.out.println("\n------------- Pc ----------------");
        DispositivoPc dpc = new DispositivoPc();
        dpc.encender(true, "Pc");
        dpc.apagar(false, "Pc");
        System.out.println(dpc.cargarBateria("Fuente de 20V", 8.50));
        dpc.MostrarResolusion("3840x2160", "Para videojuegos-Alta");
        for (int i = 0; i < 10; i++) {
            dpc.generarDefault(i);
        }
    }
}