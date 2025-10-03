package tn.esprit.gestionzoo.entities;


public class Zoo {
    private static final int NBR_CAGES = 25;
    private Animal[] animals;
    private int nbrAnimaux;
    private String nom;

    public Zoo(String nom) {
        if (nom == null || nom.trim().isEmpty()) {
            throw new IllegalArgumentException("Le nom du zoo ne peut pas être vide !");
        }
        this.nom = nom;
        this.animals = new Animal[NBR_CAGES];
        this.nbrAnimaux = 0;
    }

    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            System.out.println("Zoo plein ! Impossible d'ajouter " + animal.getNom());
            return false;
        }
        if (searchAnimal(animal) != -1) {
            System.out.println("Animal déjà présent : " + animal.getNom());
            return false;
        }
        animals[nbrAnimaux] = animal;
        nbrAnimaux++;
        return true;
    }

    public void afficherAnimaux() {
        if (nbrAnimaux == 0) {
            System.out.println("Aucun animal dans le zoo.");
            return;
        }
        for (int i = 0; i < nbrAnimaux; i++) {
            System.out.println("[" + i + "] " + animals[i]);
        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < nbrAnimaux; i++) {
            if (animals[i].equals(animal)) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) {
            System.out.println("Animal introuvable : " + animal.getNom());
            return false;
        }
        for (int i = index; i < nbrAnimaux - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[nbrAnimaux - 1] = null;
        nbrAnimaux--;
        return true;
    }

    public boolean isZooFull() {
        return nbrAnimaux >= NBR_CAGES;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        return (z1.nbrAnimaux >= z2.nbrAnimaux) ? z1 : z2;
    }

    @Override
    public String toString() {
        return "Zoo '" + nom + "' avec " + nbrAnimaux + " animaux (max " + NBR_CAGES + ")";
    }
}


