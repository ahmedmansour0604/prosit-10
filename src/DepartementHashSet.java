import java.util.HashSet;
import java.util.TreeSet;

public class DepartementHashSet implements IDepartement<Departement> {
    HashSet<Departement> departements = new HashSet<>();
    @Override
    public void ajouterDepartement(Departement departement) {
        if(departements.add(departement)){
            System.out.println("Departement ajouté!");
        }else{
            System.out.println("Departement existant!");
        }
    }
    @Override
    public boolean rechercherDepartement(String nom) {
        for(Departement d : departements){
            if(d.getNom().equals(nom)){
                return true;
            }
        }
        return false;
    }
    @Override
    public boolean rechercherDepartement(Departement departement) {
        return departements.contains(departement);
    }
    @Override
    public void supprimerDepartement(Departement departement) {
        departements.remove(departement);
    }
    @Override
    public void displayDepartement() {
        for(Departement d : departements){
            System.out.println(d);
        }
    }
    @Override
    public TreeSet<Departement> trierDepartementById() {
        TreeSet<Departement> sortedSet = new TreeSet<>(new DepartementIdComparator());
        sortedSet.addAll(departements);
        return sortedSet;
    }
}
