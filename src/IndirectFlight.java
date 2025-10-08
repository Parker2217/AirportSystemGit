import java.time.*;
import java.util.ArrayList;

public class IndirectFlight extends Flight{

    private final ArrayList<Airport> layoverAirports;
    private float refuelingFee;
    private final boolean boardingAtLayover;

    public IndirectFlight(int flightId, Airport destination, ArrayList<Airport> layoverAirports, LocalDateTime departureTime, int boardingGate, Airline airline, int baseCost, Aircraft aircraft, float refuelingFee, boolean boardingAtLayover) {
        super(flightId, destination, departureTime, boardingGate, airline, baseCost, aircraft);
        this.layoverAirports = layoverAirports;
        this.refuelingFee = refuelingFee;
        this.boardingAtLayover = boardingAtLayover;
    }

    public void addAirport(Airport airport) {
        layoverAirports.add(airport);
    }

    public void setRefuelingFee(float refuelingFee) {
        this.refuelingFee = refuelingFee;
    }

    public boolean isBoardingAtLayover() {return boardingAtLayover;}

    @Override
    public void updateCost() {
        this.setTotalCost(this.getBaseCost() + (this.getBaseCost() * this.getAirline().getProfitRate()) + refuelingFee);
    }
}
