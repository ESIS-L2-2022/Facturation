import mesure.IUniteMesure;

public class Ligne {
    private int numero;
    private int quantite;
    private Produit<IUniteMesure> produit;

    public Ligne(int quantite, Produit<IUniteMesure> produit) {
        this.quantite = quantite;
        this.produit = produit;
    }

    public Ligne(int numero, int quantite, Produit<IUniteMesure> produit) {
        this.numero = numero;
        this.quantite = quantite;
        this.produit = produit;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public Produit<IUniteMesure> getProduit() {
        return produit;
    }

    public void setProduit(Produit<IUniteMesure> produit) {
        this.produit = produit;
    }

    public double getPrixTotal() {
        return this.quantite * this.produit.getPrix();
    }
}
