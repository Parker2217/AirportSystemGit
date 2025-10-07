import java.util.ArrayList;

public class IndirectFlight extends Flight{

    private ArrayList<Airport> airports;
    private ArrayList<Passenger> passengers;

    public IndirectFlight(int flyId, String destination, String departureTime, int boardingDoor, int baseCost) {
        super(flyId, destination, departureTime, boardingDoor, baseCost);
        airports = new ArrayList<>();
        passengers = new ArrayList<>();
    }

    public void addAirport(String country, String city, int tax){
        Airport airport = new Airport(country, city, tax);
        airports.add(airport);
    }

    public void addPassenger(String name, String email, int id){
        Passenger passenger = new Passenger(name, email, id);
        passengers.add(passenger);
    }
}
