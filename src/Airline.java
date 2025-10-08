/**
 * @author Daniel Costa Neves (68191) dc.neves@campus.fct.unl.pt
 * @author Ricardo Afonso Caetano Pinéu (68561) r.pineu@campus.fct.unl.pt
 * @author Rita Wu (68700) ri.wu@campus.fct.unl.pt
 */
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
