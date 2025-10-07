import java.util.ArrayList;

public class DirectFlight extends Flight{

    public DirectFlight(int flyId, String destination, String departureTime, int boardingDoor, Airline airline, int baseCost, Aircraft aircraft) {
        super(flyId, destination, departureTime, boardingDoor, airline, baseCost, aircraft);
    }

    @Override
    public double getCost() {
        return baseCost + (baseCost * airline.getFee());
    }
}
