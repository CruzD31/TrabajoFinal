public class Riego {
    public void activar() {
        System.out.println("⚠️ ¡Humedad baja! Activando sistema de riego...");
 
        try {
            Thread.sleep(1000);
            System.out.println("✅ Riego finalizado.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
