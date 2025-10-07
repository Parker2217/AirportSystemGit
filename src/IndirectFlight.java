import java.util.ArrayList;

public class IndirectFlight extends Flight{

    private ArrayList<Airport> airports;
    private ArrayList<Passenger> passengers;
    private double refuelFee;

    public IndirectFlight(int flyId, String destination, String departureTime, int boardingDoor, Airline airline, int baseCost, Aircraft aircraft) {
        super(flyId, destination, departureTime, boardingDoor, airline, baseCost, aircraft);
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

    @Override
    public double getCost() {
        return baseCost + (baseCost * airline.getFee()) + refuelFee;
    }
}
