package grid;

public class Grid {
    private Inverter inverter;
    private Meter meter;

    public Grid(
            FabricaAbstrata fabrica) {
        this.inverter = fabrica.createInverter();
        this.meter = fabrica.createMeter();
    }

    public String startCharging() {
        return inverter.starCharging();
    }

    public String getMeterReading() {
        return meter.getReading();
    }
}
