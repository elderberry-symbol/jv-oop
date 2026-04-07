package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Truck wheels = new Truck();
        Bulldozer treads = new Bulldozer();
        Excavator pillars = new Excavator();

        Machine[] vehicles = {wheels, treads, pillars};
        for (Machine vehicle : vehicles) {
            vehicle.doWork();
            vehicle.stopWork();
        }
    }
}
