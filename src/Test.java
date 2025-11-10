public class Test {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        // Création d'employés
        Employe e1 = new Employe(1, "Ben Ali", "Mohamed", "Informatique", 3);
        Employe e2 = new Employe(2, "Trabelsi", "Fatma", "Ressources Humaines", 2);
        Employe e3 = new Employe(3, "Slim", "Ahmed", "Informatique", 1);
        Employe e4 = new Employe(4, "Masmoudi", "Leila", "Finance", 4);

        // Ajout des employés
        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);
        societe.ajouterEmploye(e4);

        // Affichage des employés
        System.out.println("=== Liste initiale des employés ===");
        societe.displayEmploye();

        // Recherche d'employé par nom
        System.out.println("\n=== Recherche d'employé ===");
        System.out.println("Recherche 'Ben Ali': " + societe.rechercherEmploye("Ben Ali"));
        System.out.println("Recherche 'Inexistant': " + societe.rechercherEmploye("Inexistant"));

        // Recherche d'employé par objet
        System.out.println("Recherche de e1: " + societe.rechercherEmploye(e1));

        // Tri par ID
        System.out.println("\n=== Tri par ID ===");
        societe.trierEmployeParId();
        societe.displayEmploye();

        // Tri par département et grade
        System.out.println("\n=== Tri par département et grade ===");
        societe.trierEmployeParNomDepartementEtGrade();
        societe.displayEmploye();

        // Suppression d'un employé
        System.out.println("\n=== Suppression d'un employé ===");
        societe.supprimerEmploye(e2);
        societe.displayEmploye();

        // Test de la méthode equals
        System.out.println("\n=== Test de la méthode equals ===");
        Employe e5 = new Employe(1, "Ben Ali", "Ali", "Marketing", 2);
        System.out.println("e1.equals(e5): " + e1.equals(e5)); // Doit retourner true (même id et nom)
    }
}
