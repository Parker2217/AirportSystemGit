/**
 * @author Daniel Costa Neves (68191) dc.neves@campus.fct.unl.pt
 * @author Ricardo Afonso Caetano Pinéu (68561) r.pineu@campus.fct.unl.pt
 * @author Rita Wu (68700) ri.wu@campus.fct.unl.pt
 */
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
