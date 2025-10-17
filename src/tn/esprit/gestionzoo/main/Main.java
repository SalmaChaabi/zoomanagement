package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class Main {
    public static void main(String[] args) {
        Zoo zoo1 = new Zoo("Safari Park");
        Zoo zoo2 = new Zoo("Zoo Aquatique");

        Animal a1 = new Animal("Lion", 5);
        Animal a2 = new Animal("Tigre", 3);
        Animal a3 = new Animal("Girafe", 7);
        Animal a4 = new Animal("Lion", 2);

        System.out.println(zoo1.addAnimal(a1));
        System.out.println(zoo1.addAnimal(a2));
        System.out.println(zoo1.addAnimal(a3));
        System.out.println(zoo1.addAnimal(a4));

        zoo1.afficherAnimaux();

        System.out.println("Recherche Tigre : index = " + zoo1.searchAnimal(new Animal("Tigre")));
        System.out.println("Recherche Panda : index = " + zoo1.searchAnimal(new Animal("Panda")));

        zoo1.removeAnimal(new Animal("Tigre"));
        zoo1.afficherAnimaux();

        System.out.println("Zoo plein ? " + zoo1.isZooFull());

        zoo2.addAnimal(new Animal("Éléphant", 10));
        zoo2.addAnimal(new Animal("Zèbre", 4));

        Zoo plusGrand = Zoo.comparerZoo(zoo1, zoo2);
        System.out.println("Le zoo le plus rempli est : " + plusGrand);


        // Partie prosit 5 (Aquatic, Terrestrial, Dolphin, Penguin)


        Aquatiques aquatic = new Aquatiques("Poisson", 2, "Mer");
        Dolphin dolphin = new Dolphin("Flipper", 5, "Océan", 25.5f);
        Penguin penguin = new Penguin("Pingu", 3, "Antarctique", 15.0f);
        Terrestres lion = new Terrestres("Lion", 6, 4);

        System.out.println(aquatic);
        System.out.println(dolphin);
        System.out.println(penguin);
        System.out.println(lion);

        aquatic.swim();
        dolphin.swim();
        penguin.swim();
    }
}



