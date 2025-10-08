/**
 * @author Daniel Costa Neves (68191) dc.neves@campus.fct.unl.pt
 * @author Ricardo Afonso Caetano Pinéu (68561) r.pineu@campus.fct.unl.pt
 * @author Rita Wu (68700) ri.wu@campus.fct.unl.pt
 */
public class Aircraft {
    private final String registrationID;
    private final AircraftModel model;
    private Airline airline;

    public Aircraft(String registrationID, AircraftModel model, Airline airline) {
        this.registrationID = registrationID;
        this.model = model;
        this.airline = airline;
    }

    public String getRegistrationID() {return registrationID;}

    public AircraftModel getModel() {return model;}

    public Airline getAirline() {return airline;}

    public void setAirline(Airline airline) {this.airline = airline;}
}
