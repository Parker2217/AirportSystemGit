public abstract class Flight {
    private int flightId;
    private String destination;
    private String departureTime;
    private int boardingDoor;
    protected Airline airline;
    protected double baseCost;
    private Aircraft aircraft;

    public Flight(int flyId, String destination, String departureTime, int boardingDoor, Airline airline, int baseCost, Aircraft aircraft) {
        this.flightId = flyId;
        this.destination = destination;
        this.departureTime = departureTime;
        this.boardingDoor = boardingDoor;
        this.airline = airline;
        this.baseCost = baseCost;
        this.aircraft = aircraft;
    }

    public int getFlightId() {return flightId;}

    public String getDestination() {return destination;}

    public String getDepartureTime() {return departureTime;}

    public int getBoardingDoor() {return boardingDoor;}

    public Airline getAirline() {return airline;}

    public Aircraft getAircraft() {return aircraft;}

    public abstract double getCost();
}
