import java.util.ArrayList;

public class IndirectFlight extends Flight{

    private ArrayList<Airport> airports;
    private ArrayList<Passenger> passengers;

    public IndirectFlight(int flyId, String destination, String departureTime, int boardingDoor, int baseCost) {
        super(flyId, destination, departureTime, boardingDoor, baseCost);
        airports = new ArrayList<>();
        passengers = new ArrayList<>();
    }
}
