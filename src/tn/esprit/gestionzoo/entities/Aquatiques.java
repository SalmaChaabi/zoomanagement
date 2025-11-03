package tn.esprit.gestionzoo.entities;

public abstract class Aquatiques extends Animal {
    protected String habitat;

    public Aquatiques(String nom, int age, String habitat) throws InvalidAgeException {
        super(nom, age);
        this.habitat = habitat;
    }

    public Aquatiques() throws InvalidAgeException {
        super("", 0);
        this.habitat = "";
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return super.toString() + " - Habitat : " + habitat;
    }

    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }
}