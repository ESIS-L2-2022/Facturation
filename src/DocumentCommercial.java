import java.util.ArrayList;

public abstract class DocumentCommercial {
    private Long numero;
    private Client client;
    private Detail detail;

    public DocumentCommercial(Long numero, Client client, Detail detail) {
        this.numero = numero;
        this.client = client;
        this.detail = detail;
    }

    public double getTotal() {
        double total = 0.0;
        for (Ligne l : detail.ligne) {
            total += l.getPrixTotal();
        }
        return total;
    }

    public double getTVA() {
        return 16 * 100 / this.getTotal();
    }

    public class Detail {
        public ArrayList<Ligne> ligne = new ArrayList<Ligne>();

    }

}
