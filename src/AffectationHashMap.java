import java.util.*;
import java.util.Map.Entry;

public class AffectationHashMap {
    private HashMap<Employe, Departement> affectations;

    public AffectationHashMap() {
        affectations = new HashMap<>();
    }

    // Instruction 2: Ajouter employé à département
    public void ajouterEmployeDepartement(Employe e, Departement d) {
        if (!affectations.containsKey(e)) {
            affectations.put(e, d);
            // Mettre à jour le nombre d'employés du département
            d.setNombreEmployes(d.getNombreEmployes() + 1);
            System.out.println("Employé " + e.getNom() + " affecté au département " + d.getNomDepartement());
        } else {
            System.out.println("L'employé " + e.getNom() + " est déjà affecté à un département!");
        }
    }

    // Instruction 3: Afficher employés et départements
    public void afficherEmployesEtDepartements() {
        System.out.println("\n=== AFFECTATIONS EMPLOYÉS-DÉPARTEMENTS ===");
        if (affectations.isEmpty()) {
            System.out.println("Aucune affectation trouvée.");
            return;
        }

        for (Map.Entry<Employe, Departement> entry : affectations.entrySet()) {
            System.out.println("Employé: " + entry.getKey().getNom() + " " + entry.getKey().getPrenom() +
                    " → Département: " + entry.getValue().getNomDepartement() +
                    " (ID: " + entry.getValue().getId() + ", Employés: " + entry.getValue().getNombreEmployes() + ")");
        }
    }

    // Instruction 4: Supprimer employé
    public void supprimerEmploye(Employe e) {
        if (affectations.containsKey(e)) {
            Departement d = affectations.get(e);
            // Mettre à jour le nombre d'employés du département
            d.setNombreEmployes(d.getNombreEmployes() - 1);
            affectations.remove(e);
            System.out.println("Employé " + e.getNom() + " supprimé des affectations.");
        } else {
            System.out.println("Employé " + e.getNom() + " non trouvé dans les affectations.");
        }
    }

    // Instruction 5: Supprimer employé et département spécifique
    public void supprimerEmployeEtDepartement(Employe e, Departement d) {
        if (affectations.containsKey(e) && affectations.get(e).equals(d)) {
            // Mettre à jour le nombre d'employés du département
            d.setNombreEmployes(d.getNombreEmployes() - 1);
            affectations.remove(e);
            System.out.println("Employé " + e.getNom() + " supprimé du département " + d.getNomDepartement());
        } else {
            System.out.println("Affectation non trouvée pour cet employé et département.");
        }
    }

    // Instruction 6: Afficher les employés
    public void afficherEmployes() {
        System.out.println("\n=== LISTE DES EMPLOYÉS ===");
        if (affectations.isEmpty()) {
            System.out.println("Aucun employé trouvé.");
            return;
        }

        for (Employe e : affectations.keySet()) {
            System.out.println(e);
        }
    }

    // Instruction 7: Afficher les départements
    public void afficherDepartements() {
        System.out.println("\n=== LISTE DES DÉPARTEMENTS ===");
        if (affectations.isEmpty()) {
            System.out.println("Aucun département trouvé.");
            return;
        }

        // Utiliser un Set pour éviter les doublons
        Set<Departement> departementsUniques = new HashSet<>(affectations.values());
        for (Departement d : departementsUniques) {
            System.out.println(d);
        }
    }

    // Instruction 8: Rechercher employé
    public boolean rechercherEmploye(Employe e) {
        boolean existe = affectations.containsKey(e);
        System.out.println("Recherche employé " + e.getNom() + ": " + existe);
        return existe;
    }

    // Instruction 9: Rechercher département
    public boolean rechercherDepartement(Departement d) {
        boolean existe = affectations.containsValue(d);
        System.out.println("Recherche département " + d.getNomDepartement() + ": " + existe);
        return existe;
    }

    // Instruction 10: Trier par ID employé
    public TreeMap<Employe, Departement> trierMap() {
        TreeMap<Employe, Departement> treeMap = new TreeMap<>(affectations);
        System.out.println("\n=== AFFECTATIONS TRIÉES PAR ID EMPLOYÉ ===");
        for (Map.Entry<Employe, Departement> entry : treeMap.entrySet()) {
            System.out.println("ID: " + entry.getKey().getId() + " - " +
                    entry.getKey().getNom() + " → " + entry.getValue().getNomDepartement());
        }
        return treeMap;
    }

    // Méthode utilitaire pour obtenir le nombre d'affectations
    public int getNombreAffectations() {
        return affectations.size();
    }
}
