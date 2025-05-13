public class Main {
    public static void main(String[] args) {
        Sensor sensor = new Sensor();
        Riego riego = new Riego();

        for (int i = 0; i < 5; i++) {
            double humedad = sensor.leerHumedad();
            System.out.println("Humedad actual: " + humedad + "%");

            if (humedad < 40) {
                riego.activar();
            } else {
                System.out.println("Humedad suficiente. No se activa el riego.");
            }

            System.out.println("---------------");
            try {
                Thread.sleep(2000); // Espera 2 segundos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
