import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
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
    }
}
