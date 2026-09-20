package grid;

public class FabricaGoodwe implements FabricaAbstrata {
    public Inverter createInverter() {
        return new InverterGoodwe();
    }

    public Meter createMeter() {
        return new MeterGoodwe();
    }
}
