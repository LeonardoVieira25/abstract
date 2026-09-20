import grid.FabricaGoodwe;
import grid.Grid;

public class Main {
    public static void main(String[] args) {
        Grid grid = new Grid(
                new FabricaGoodwe());
        System.out.println("Grid initialized with FabricaGoodwe.");
        System.out.println("Start charging: " + grid.startCharging());
        System.out.println("Meter reading: " + grid.getMeterReading());
    }
}
