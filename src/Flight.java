public abstract class Flight {
    private int flightId;
    private String destination;
    private String departureTime;
    private int boardingDoor;
    private String airline;
    private int baseCost;

    public Flight(int flyId, String destination, String departureTime, int boardingDoor, int baseCost) {
        this.flightId = flyId;
        this.destination = destination;
        this.departureTime = departureTime;
        this.boardingDoor = boardingDoor;
        this.baseCost = baseCost;
    }

    public int getFlightId() {return flightId;}

    public String getDestination() {return destination;}

    public String getDepartureTime() {return departureTime;}

    public int getBoardingDoor() {return boardingDoor;}

    public String getAirline() {return airline;}
}
