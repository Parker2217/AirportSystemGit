/**
 * @author Daniel Costa Neves (68191) dc.neves@campus.fct.unl.pt
 * @author Ricardo Afonso Caetano Pinéu (68561) r.pineu@campus.fct.unl.pt
 * @author Rita Wu (68700) ri.wu@campus.fct.unl.pt
 */
public class AircraftModel {

    private final EManufacturer manufacturer;
    private final String model;
    private final int capacity;

    public AircraftModel(EManufacturer manufacturer, String model, int capacity) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.capacity = capacity;
    }

    public EManufacturer getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getCapacity() {
        return capacity;
    }
}
