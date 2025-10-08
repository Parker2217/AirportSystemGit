public class AircraftModel {

    private EManufacturer manufacturer;
    private String model;
    private int capacity;

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
