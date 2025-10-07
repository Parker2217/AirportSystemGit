public class Passenger {
    private String name;
    private String email;
    private int passportId;

    public Passenger(String name, String email, int id) {
        this.name = name;
        this.email = email;
        this.passportId = id;
    }

    public String getName() {return name;}

    public String getEmail() {return email;}

    public int getId() {return passportId;}
}
