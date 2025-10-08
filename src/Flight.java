/**
 * @author Daniel Costa Neves (68191) dc.neves@campus.fct.unl.pt
 * @author Ricardo Afonso Caetano Pinéu (68561) r.pineu@campus.fct.unl.pt
 * @author Rita Wu (68700) ri.wu@campus.fct.unl.pt
 */
import java.time.*;

public abstract class Flight {
    private final int flightId;
    private final Airport destination;
    private LocalDateTime departureTime;
    private int boardingGate;
    private final Airline airline;
    private float baseCost;
    private float totalCost;
    private Aircraft aircraft;

    protected Flight(int flightId, Airport destination, LocalDateTime departureTime, int boardingGate, Airline airline, float baseCost, Aircraft aircraft) {
        this.flightId = flightId;
        this.destination = destination;
        this.departureTime = departureTime;
        this.boardingGate = boardingGate;
        this.airline = airline;
        this.baseCost = baseCost;
        this.aircraft = aircraft;
    }

    public int getFlightId() {return flightId;}

    public Airport getDestination() {return destination;}

    public LocalDateTime getDepartureTime() {return departureTime;}

    public int getBoardingGate() {return boardingGate;}

    public Airline getAirline() {return airline;}

    public Aircraft getAircraft() {return aircraft;}

    public float getBaseCost() {return baseCost;}

    public float getTotalCost() {return totalCost;}

    public void setFlightTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public void setBoardingGate(int boardingGate) {
        this.boardingGate = boardingGate;
    }

    public void setBaseCost(float baseCost) {
        this.baseCost = baseCost;
    }

    public void setAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
    }

    protected void setTotalCost(float totalCost) {this.totalCost = totalCost;}

    protected abstract void updateCost();
}
