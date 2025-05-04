import java.util.HashMap;
import java.util.TreeMap;

public class AffectationHashMap {
    HashMap<Employe, Departement> affectation = new HashMap<>();
    public AffectationHashMap() {
    }
    public void ajouterEmployeDepartement(Employe e, Departement d){
        affectation.put(e, d);
    }
    public void afficherEmployesEtDepartements(){
        for(Employe e : affectation.keySet()){
            System.out.println(e+" a pour departement "+affectation.get(e));
        }
    }
    public void supprimerEmploye(Employe e){
        affectation.remove(e);
    }
    public void supprimerEmployeEtDepartement (Employe e, Departement d){
        affectation.remove(e, d);
    }
    public void afficherEmployes(){
        for(Employe e : affectation.keySet()){
            System.out.println(e);
        }
    }
    public void afficherDepartements(){
        for(Departement d : affectation.values()){
            System.out.println(d);
        }
    }
    public boolean rechercherEmploye (Employe e){
        return affectation.containsKey(e);
    }
    public boolean rechercherDepartement (Departement d){
        return affectation.containsValue(d);
    }
    public TreeMap<Employe, Departement> trierMap(){
        return new TreeMap<>(affectation);
    }
}
