public class Airline {
    private String name;
    private float profitRate;

    public Airline(String name, float profitRate) {
        this.name = name;
        this.profitRate = profitRate;
    }

    public String getName() {return name;}

    public float getProfitRate() {return profitRate;}

    public void setName(String name) {
        this.name = name;
    }

    public void setProfitRate(float profitRate) {
        this.profitRate = profitRate;
    }
}
