package grid;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GridTest {
    @Test
    void testGetMeterReadingGoodwe() {
        Grid grid = new Grid(new FabricaGoodwe());
        assertEquals("Reading from Goodwe meter.", grid.getMeterReading());
    }

    @Test
    void testStartChargingGoodwe() {
        Grid grid = new Grid(new FabricaGoodwe());
        assertEquals("Charging started with Goodwe inverter.", grid.startCharging());
    }

    @Test
    void testGetMeterReadingSigenergy() {
        Grid grid = new Grid(new FabricaSigenergy());
        assertEquals("Reading from Sigenergy meter.", grid.getMeterReading());
    }

    @Test
    void testStartChargingSigenergy() {
        Grid grid = new Grid(new FabricaSigenergy());
        assertEquals("Charging started with Sigenergy inverter.", grid.startCharging());
    }
}
