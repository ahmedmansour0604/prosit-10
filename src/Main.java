public class Main {
    public static void main(String[] args) {
        DepartementHashSet departements = new DepartementHashSet();
        departements.ajouterDepartement(new Departement(4, "Informatique", 10));
        departements.ajouterDepartement(new Departement(2, "Gestion", 15));
        departements.ajouterDepartement(new Departement(6, "Marketing", 20));
        System.out.println("Departements triee par id : \n"+departements.trierDepartementById());
    }
}