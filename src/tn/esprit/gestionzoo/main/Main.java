package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class Main {
    public static void main(String[] args) {
        try {
            Zoo zoo1 = new Zoo("Safari Park");

            // Instruction 34: Gestion des exceptions d'âge invalide
            try {
                Animal a1 = new Animal("Lion", 5);
                Animal a2 = new Animal("Tigre", 3);
                Animal a3 = new Animal("Girafe", 7);

                // Instruction 33: Gestion des exceptions de zoo plein
                zoo1.addAnimal(a1);
                System.out.println("Nombre d'animaux après ajout 1: " + zoo1.getNbrAnimaux());

                zoo1.addAnimal(a2);
                System.out.println("Nombre d'animaux après ajout 2: " + zoo1.getNbrAnimaux());

                zoo1.addAnimal(a3);
                System.out.println("Nombre d'animaux après ajout 3: " + zoo1.getNbrAnimaux());

                // Test avec un animal d'âge négatif
                try {
                    Animal a4 = new Animal("Éléphant", -2);
                    zoo1.addAnimal(a4);
                } catch (InvalidAgeException e) {
                    System.out.println("Erreur d'âge: " + e.getMessage());
                }

                // Test zoo plein
                Animal a5 = new Animal("Zèbre", 4);
                zoo1.addAnimal(a5);

            } catch (ZooFullException e) {
                System.out.println("Erreur zoo plein: " + e.getMessage());
            } catch (InvalidAgeException e) {
                System.out.println("Erreur création animal: " + e.getMessage());
            }

            // === Prosit 6 (adapté avec gestion d'exceptions) ===
            try {
                Dolphin dolphin = new Dolphin("Flipper", 5, "Océan", 25.5f);
                Penguin penguin = new Penguin("Pingu", 3, "Antarctique", 15.0f);

                // Création de la classe anonyme pour Aquatiques
                Aquatiques poisson = new Aquatiques("Poisson", 2, "Mer") {
                    @Override
                    public void swim() {
                        System.out.println("This fish is swimming.");
                    }
                };

                Terrestres lion = new Terrestres("Lion", 6, 4);

                // Ces ajouts vont échouer car le zoo est déjà plein
                try {
                    zoo1.addAnimal(poisson);
                } catch (ZooFullException e) {
                    System.out.println("Impossible d'ajouter poisson: " + e.getMessage());
                }

                try {
                    zoo1.addAnimal(dolphin);
                } catch (ZooFullException e) {
                    System.out.println("Impossible d'ajouter dolphin: " + e.getMessage());
                }

                try {
                    zoo1.addAnimal(penguin);
                } catch (ZooFullException e) {
                    System.out.println("Impossible d'ajouter penguin: " + e.getMessage());
                }

                try {
                    zoo1.addAnimal(lion);
                } catch (ZooFullException e) {
                    System.out.println("Impossible d'ajouter lion terrestre: " + e.getMessage());
                }

                // === ➕ Instructions 35 à 38 : Tests des interfaces ===
                System.out.println("\n=== Test des interfaces Carnivore / Omnivore ===");

                Aquatiques requin = new Aquatiques("Requin", 8, "Océan") {
                    @Override
                    public void swim() {
                        System.out.println("Le requin nage rapidement dans l'océan !");
                    }
                };

                Terrestres ours = new Terrestres("Ours", 10, 4);

                // Test des comportements alimentaires
                requin.eatMeat(Food.MEAT);
                requin.eatMeat(Food.PLANT);

                ours.eatMeat(Food.MEAT);
                ours.eatPlant(Food.PLANT);
                ours.eatPlantAndMeat(Food.BOTH);

            } catch (InvalidAgeException e) {
                System.out.println("Erreur création animal aquatique: " + e.getMessage());
            }

            System.out.println("\n=== Liste des animaux ===");
            zoo1.afficherAnimaux();

            System.out.println("\n=== Tous les aquatiques nagent ===");
            zoo1.makeAquaticsSwim();

            System.out.println("\nProfondeur max des pingouins : " + zoo1.maxPenguinSwimmingDepth());
            zoo1.displayNumberOfAquaticsByType();

        } catch (Exception e) {
            System.out.println("Erreur générale: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
