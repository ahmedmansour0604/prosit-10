public class Employe implements Comparable<Employe>{
    private int id;
    private String nom;
    public Employe(){}
    public Employe(int id,String nom){
        this.id=id;
        this.nom=nom;
    }
    public int getId(){
        return id;
    }
    public String getNom(){
        return nom;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Employe)) return false;
        Employe e = (Employe) obj;
        return this.id == e.id && this.nom.equals(e.nom);
    }
    @Override
    public int hashCode() {
        return (22+this.id*63)*15 + this.nom.hashCode();
    }
    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                '}';
    }
    @Override
    public int compareTo(Employe o) {
        return this.id - o.id;
    }
}
