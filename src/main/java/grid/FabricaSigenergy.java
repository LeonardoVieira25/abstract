package grid;

public class FabricaSigenergy implements FabricaAbstrata {
    public Meter createMeter() {
        return new MeterGoodwe();
    }

    public Inverter createInverter() {
        return new InverterSigenergy();
    }

}
