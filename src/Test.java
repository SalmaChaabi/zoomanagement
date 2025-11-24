import java.util.TreeSet;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        // ===== TEST EXISTANT (Prosit précédent) =====
        System.out.println("======= TEST PROSIT PRÉCÉDENT =======");
        DepartementHashSet gestionDepartements = new DepartementHashSet();

        // Création de départements
        Departement d1 = new Departement(1, "Informatique", 25);
        Departement d2 = new Departement(2, "Ressources Humaines", 15);
        Departement d3 = new Departement(3, "Finance", 20);
        Departement d4 = new Departement(4, "Marketing", 18);

        // Ajout des départements
        gestionDepartements.ajouterDepartement(d1);
        gestionDepartements.ajouterDepartement(d2);
        gestionDepartements.ajouterDepartement(d3);
        gestionDepartements.ajouterDepartement(d4);

        // Affichage des départements
        System.out.println("=== Liste initiale des départements ===");
        gestionDepartements.displayDepartement();

        // Recherche de département par nom
        System.out.println("\n=== Recherche de département ===");
        System.out.println("Recherche 'Informatique': " + gestionDepartements.rechercherDepartement("Informatique"));
        System.out.println("Recherche 'Inexistant': " + gestionDepartements.rechercherDepartement("Inexistant"));

        // Recherche de département par objet
        System.out.println("Recherche de d1: " + gestionDepartements.rechercherDepartement(d1));

        // Tri par ID
        System.out.println("\n=== Tri par ID ===");
        TreeSet<Departement> departementsTries = gestionDepartements.trierDepartementById();
        for (Departement dep : departementsTries) {
            System.out.println(dep);
        }

        // Suppression d'un département
        System.out.println("\n=== Suppression d'un département ===");
        gestionDepartements.supprimerDepartement(d2);
        System.out.println("Après suppression du département RH:");
        gestionDepartements.displayDepartement();

        // Test de la méthode equals
        System.out.println("\n=== Test de la méthode equals ===");
        Departement d5 = new Departement(1, "Informatique", 30); // Même id et nom
        Departement d6 = new Departement(1, "Development", 25);  // Même id mais nom différent
        System.out.println("d1.equals(d5): " + d1.equals(d5)); // Doit retourner true (même id et nom)
        System.out.println("d1.equals(d6): " + d1.equals(d6)); // Doit retourner false (nom différent)

        // Test d'ajout d'un département avec même id et nom (ne devrait pas être ajouté à cause du HashSet et equals)
        System.out.println("\n=== Test d'ajout d'un département dupliqué ===");
        System.out.println("Avant ajout du dupliqué:");
        gestionDepartements.displayDepartement();
        gestionDepartements.ajouterDepartement(d5); // Même id et nom que d1
        System.out.println("Après tentative d'ajout du dupliqué:");
        gestionDepartements.displayDepartement(); // Ne devrait pas apparaître en double

        // Test supplémentaire: Vérification du nombre d'employés
        System.out.println("\n=== Test modification nombre d'employés ===");
        System.out.println("Nombre d'employés dans Informatique avant: " + d1.getNombreEmployes());
        d1.setNombreEmployes(30);
        System.out.println("Nombre d'employés dans Informatique après: " + d1.getNombreEmployes());

        // ===== NOUVEAU TEST PROSIT 11 =====
        System.out.println("\n\n======= TEST PROSIT 11 - AFFECTATION HASHMAP =======");

        AffectationHashMap gestionAffectations = new AffectationHashMap();

        // Création des employés
        Employe e1 = new Employe(1, "Ben Ali", "Mohamed", "Informatique", 3);
        Employe e2 = new Employe(2, "Trabelsi", "Fatma", "RH", 2);
        Employe e3 = new Employe(3, "Slim", "Ahmed", "Finance", 1);
        Employe e4 = new Employe(4, "Masmoudi", "Leila", "Marketing", 4);
        Employe e5 = new Employe(5, "Gharbi", "Samir", "Informatique", 2);

        // Réinitialisation des départements pour les affectations (avec 0 employés au début)
        Departement depInfo = new Departement(1, "Informatique", 0);
        Departement depRH = new Departement(2, "Ressources Humaines", 0);
        Departement depFinance = new Departement(3, "Finance", 0);
        Departement depMarketing = new Departement(4, "Marketing", 0);

        System.out.println("\n=== INSTRUCTION 2: AJOUT D'AFFECTATIONS ===");
        gestionAffectations.ajouterEmployeDepartement(e1, depInfo);
        gestionAffectations.ajouterEmployeDepartement(e2, depRH);
        gestionAffectations.ajouterEmployeDepartement(e3, depFinance);
        gestionAffectations.ajouterEmployeDepartement(e4, depMarketing);
        gestionAffectations.ajouterEmployeDepartement(e5, depInfo); // Deuxième employé en Informatique

        System.out.println("\n=== INSTRUCTION 3: AFFICHAGE EMPLOYÉS & DÉPARTEMENTS ===");
        gestionAffectations.afficherEmployesEtDepartements();

        System.out.println("\n=== TEST: AJOUT DU MÊME EMPLOYÉ DANS DEUX DÉPARTEMENTS ===");
        gestionAffectations.ajouterEmployeDepartement(e1, depRH); // Doit échouer - employé déjà affecté

        System.out.println("\n=== INSTRUCTION 6: AFFICHER EMPLOYÉS ===");
        gestionAffectations.afficherEmployes();

        System.out.println("\n=== INSTRUCTION 7: AFFICHER DÉPARTEMENTS ===");
        gestionAffectations.afficherDepartements();

        System.out.println("\n=== INSTRUCTION 8: RECHERCHER EMPLOYÉ ===");
        gestionAffectations.rechercherEmploye(e1);
        gestionAffectations.rechercherEmploye(new Employe(10, "Inexistant", "Test", "Test", 1));

        System.out.println("\n=== INSTRUCTION 9: RECHERCHER DÉPARTEMENT ===");
        gestionAffectations.rechercherDepartement(depInfo);
        gestionAffectations.rechercherDepartement(new Departement(10, "Inexistant", 0));

        System.out.println("\n=== INSTRUCTION 10: TRI PAR ID EMPLOYÉ (TreeMap) ===");
        TreeMap<Employe, Departement> mapTriee = gestionAffectations.trierMap();

        System.out.println("\n=== STATISTIQUES AVANT SUPPRESSION ===");
        System.out.println("Nombre total d'affectations: " + gestionAffectations.getNombreAffectations());

        System.out.println("\n=== INSTRUCTION 4: SUPPRIMER EMPLOYÉ ===");
        gestionAffectations.supprimerEmploye(e3);
        gestionAffectations.afficherEmployesEtDepartements();

        System.out.println("\n=== INSTRUCTION 5: SUPPRIMER EMPLOYÉ ET DÉPARTEMENT SPÉCIFIQUE ===");
        gestionAffectations.supprimerEmployeEtDepartement(e2, depRH);
        gestionAffectations.afficherEmployesEtDepartements();

        System.out.println("\n=== TEST SUPPRÉMENTAIRE: TENTATIVE SUPPRESSION AVEC MAUVAIS DÉPARTEMENT ===");
        gestionAffectations.supprimerEmployeEtDepartement(e1, depMarketing); // Doit échouer

        System.out.println("\n=== AFFICHAGE FINAL ===");
        gestionAffectations.afficherEmployesEtDepartements();
        System.out.println("Nombre final d'affectations: " + gestionAffectations.getNombreAffectations());

        // Test de la cohérence entre equals et hashCode
        System.out.println("\n=== TEST COHÉRENCE EQUALS/HASHCODE ===");
        Employe e1bis = new Employe(1, "Ben Ali", "Ali", "Marketing", 2); // Même id et nom
        System.out.println("e1.equals(e1bis): " + e1.equals(e1bis));
        System.out.println("e1.hashCode() == e1bis.hashCode(): " + (e1.hashCode() == e1bis.hashCode()));
        System.out.println("Recherche avec e1bis: " + gestionAffectations.rechercherEmploye(e1bis)); // Doit trouver e1
    }
}
