public abstract class Personne {
    private String nom;
    private String prenom;
    private Adresse adresse;

    public Personne(String nom, String prenom, Adresse adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }

    public Personne(String nom) {
        this.nom = nom;
    }

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }


    public class Adresse {
        private String numero;
        private String avenue;
        private String cellule;
        private String quartier;
        private String commune;
        private String ville;
        private String pays;

        public Adresse(String numero, String avenue, String cellule, String quartier, String commune, String ville, String pays) {
            this.numero = numero;
            this.avenue = avenue;
            this.cellule = cellule;
            this.quartier = quartier;
            this.commune = commune;
            this.ville = ville;
            this.pays = pays;
        }

        public Adresse() {
        }

        public String getNumero() {
            return numero;
        }

        public void setNumero(String numero) {
            this.numero = numero;
        }

        public String getAvenue() {
            return avenue;
        }

        public void setAvenue(String avenue) {
            this.avenue = avenue;
        }

        public String getCellule() {
            return cellule;
        }

        public void setCellule(String cellule) {
            this.cellule = cellule;
        }

        public String getQuartier() {
            return quartier;
        }

        public void setQuartier(String quartier) {
            this.quartier = quartier;
        }

        public String getCommune() {
            return commune;
        }

        public void setCommune(String commune) {
            this.commune = commune;
        }

        public String getVille() {
            return ville;
        }

        public void setVille(String ville) {
            this.ville = ville;
        }

        public String getPays() {
            return pays;
        }

        public void setPays(String pays) {
            this.pays = pays;
        }
    }
}
