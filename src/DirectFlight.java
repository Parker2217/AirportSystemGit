import java.time.*;

public class DirectFlight extends Flight{

    public DirectFlight(int flightId, Airport destination, LocalDateTime departureTime, int boardingGate, Airline airline, int baseCost, Aircraft aircraft) {
        super(flightId, destination, departureTime, boardingGate, airline, baseCost, aircraft);
    }

    @Override
    public void updateCost() {
        this.setTotalCost(this.getBaseCost() + (this.getBaseCost() * this.getAirline().getProfitRate()));
    }
}
