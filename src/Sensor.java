import java.util.Random;

public class Sensor {
    Random random = new Random();

    public double leerHumedad() {
     
        return 30 + (random.nextDouble() * 40);
    }
}
