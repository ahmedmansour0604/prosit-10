public class Main {
    public static void main(String[] args) {
        /*DepartementHashSet departements = new DepartementHashSet();
        departements.ajouterDepartement(new Departement(4, "Informatique", 10));
        departements.ajouterDepartement(new Departement(2, "Gestion", 15));
        departements.ajouterDepartement(new Departement(6, "Marketing", 20));

        System.out.println("Departements triee par id : \n"+departements.trierDepartementById());
        */
        AffectationHashMap affectation = new AffectationHashMap();
        affectation.ajouterEmployeDepartement(new Employe(1, "Ahmed"), new Departement(2, "Gestion", 15));
        affectation.ajouterEmployeDepartement(new Employe(5, "Mohamed"), new Departement(4, "Informatique", 10));
        affectation.ajouterEmployeDepartement(new Employe(3, "Omar"), new Departement(6, "Marketing", 20));
        affectation.ajouterEmployeDepartement(new Employe(5, "Mohamed"), new Departement(6, "Marketing", 20));
        affectation.afficherEmployesEtDepartements();
        //affectation.supprimerEmploye(new Employe(2, "Mohamed"));
        //System.out.println();
        //affectation.afficherEmployesEtDepartements();
        System.out.println();
        affectation.afficherEmployes();
        System.out.println();
        affectation.afficherDepartements();
        System.out.println();
        System.out.println(affectation.trierMap());
    }
}