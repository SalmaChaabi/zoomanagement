package tn.esprit.gestionzoo.entities;

public class Terrestres extends Animal implements Omnivore<Food> {
    protected int nbrLegs;

    public Terrestres(String nom, int age, int nbrLegs) throws InvalidAgeException {
        super(nom, age);
        this.nbrLegs = nbrLegs;
    }

    public Terrestres() throws InvalidAgeException {
        super();
        this.nbrLegs = 0;
    }

    public int getNbrLegs() {
        return nbrLegs;
    }

    public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }

    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH) {
            System.out.println(getNom() + " mange de la viande.");
        } else {
            System.out.println(getNom() + " ne mange pas de plante !");
        }
    }

    @Override
    public void eatPlant(Food plant) {
        if (plant == Food.PLANT || plant == Food.BOTH) {
            System.out.println(getNom() + " mange des plantes.");
        } else {
            System.out.println(getNom() + " ne mange pas de viande !");
        }
    }

    @Override
    public void eatPlantAndMeat(Food food) {
        if (food == Food.BOTH) {
            System.out.println(getNom() + " mange de tout (plantes et viande).");
        } else {
            System.out.println(getNom() + " est omnivore mais cette nourriture n’est pas mixte.");
        }
    }
}