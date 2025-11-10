import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class SocieteArrayList implements IGestion<Employe> {
    private ArrayList<Employe> listeEmployes;

    public SocieteArrayList() {
        this.listeEmployes = new ArrayList<>();
    }

    @Override
    public void ajouterEmploye(Employe e) {
        listeEmployes.add(e);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe e : listeEmployes) {
            if (e.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        return listeEmployes.contains(e);
    }

    @Override
    public void supprimerEmploye(Employe e) {
        listeEmployes.remove(e);
    }

    @Override
    public void displayEmploye() {
        System.out.println("=== Liste des employés ===");
        for (Employe e : listeEmployes) {
            System.out.println(e);
        }
        System.out.println("==========================");
    }

    @Override
    public void trierEmployeParId() {
        // Utilisation du tri naturel via Comparable
        Collections.sort(listeEmployes);
    }

    @Override
    public void trierEmployeParNomDepartementEtGrade() {
        // Utilisation d'un Comparator personnalisé
        Collections.sort(listeEmployes, new Comparator<Employe>() {
            @Override
            public int compare(Employe e1, Employe e2) {
                // Premier critère : nom du département
                int compareDepartement = e1.getNomDepartement().compareTo(e2.getNomDepartement());
                if (compareDepartement != 0) {
                    return compareDepartement;
                }
                // Deuxième critère : grade (ordre décroissant)
                return Integer.compare(e2.getGrade(), e1.getGrade());
            }
        });
    }

    // Méthode utilitaire pour obtenir le nombre d'employés
    public int getNombreEmployes() {
        return listeEmployes.size();
    }
}
