package grid;

public class FabricaSigenergy implements FabricaAbstrata {
    public Meter createMeter() {
        return new MeterSigenergy();
    }

    public Inverter createInverter() {
        return new InverterSigenergy();
    }

}
