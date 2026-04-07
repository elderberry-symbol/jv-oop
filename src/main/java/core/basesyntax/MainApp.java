package core.basesyntax;

public class MainApp {
    void main(String[] args) {
        Machine wheels = new Truck();
        Machine treads = new Bulldozer();
        Machine pillars = new Excavator();

        Machine[] vehicles = {wheels, treads, pillars};
        for (Machine vehicle : vehicles) {
            vehicle.doWork();
            vehicle.stopWork();
        }
    }
}
