package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class Main {
    public static void main(String[] args) {
        Zoo zoo1 = new Zoo("Safari Park");

        Animal a1 = new Animal("Lion", 5);
        Animal a2 = new Animal("Tigre", 3);
        Animal a3 = new Animal("Girafe", 7);
        zoo1.addAnimal(a1);
        zoo1.addAnimal(a2);
        zoo1.addAnimal(a3);

        // --- Prosit 6 ---
        Dolphin dolphin = new Dolphin("Flipper", 5, "Océan", 25.5f);
        Penguin penguin = new Penguin("Pingu", 3, "Antarctique", 15.0f);
        Aquatiques poisson = new Aquatiques("Poisson", 2, "Mer") {
            @Override
            public void swim() {
                System.out.println("This fish is swimming.");
            }
        };
        Terrestres lion = new Terrestres("Lion", 6, 4);

        zoo1.addAnimal(poisson);
        zoo1.addAnimal(dolphin);
        zoo1.addAnimal(penguin);
        zoo1.addAnimal(lion);

        System.out.println("\n=== Liste des animaux ===");
        zoo1.afficherAnimaux();

        System.out.println("\n=== Tous les aquatiques nagent ===");
        zoo1.makeAquaticsSwim();

        System.out.println("\nProfondeur max des pingouins : " + zoo1.maxPenguinSwimmingDepth());
        zoo1.displayNumberOfAquaticsByType();
    }
}




