public class Departement {
    private int id;
    private String nom;
    private int nbrEmployes;
    public Departement(int id, String nom, int nbrEmployes) {
        this.id = id;
        this.nom = nom;
        this.nbrEmployes = nbrEmployes;
    }
    public Departement() {}
    public int getId() {
        return id;
    }
    public String getNom() {
        return nom;
    }
    public int getNbrEmployes() {
        return nbrEmployes;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setNbrEmployes(int nbrEmployes) {
        this.nbrEmployes = nbrEmployes;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Departement)) return false;
        Departement d = (Departement) obj;
        return this.id == d.id && this.nom.equals(d.nom);
    }
    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", nbrEmployes=" + nbrEmployes +
                '}';
    }
    @Override
    public int hashCode() {
        return (22+this.id*63)*15 + this.nom.hashCode();
    }
}
