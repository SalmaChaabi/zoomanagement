package tn.esprit.gestionzoo.entities;

public class Terrestres extends Animal {
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
}