public class Aircraft {
    private String registrationID;
    private AircraftModel model;
    private Airline airline;

    public Aircraft(String registrationID, AircraftModel model, Airline airline) {
        this.registrationID = registrationID;
        this.model = model;
        this.airline = airline;
    }

    public String getRegistrationID() {return registrationID;}

    public AircraftModel getModel() {return model;}

    public Airline getAirline() {return airline;}

    public EManufacturer getManufacturer() {
        return model.getManufacturer();
    }

    public String getModelName() {
        return model.getModel();
    }

    public int getCapacity() {
        return model.getCapacity();
    }
}
