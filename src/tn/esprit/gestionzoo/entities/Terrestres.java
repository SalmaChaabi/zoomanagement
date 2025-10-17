package tn.esprit.gestionzoo.entities;

public class Terrestres extends Animal {
    protected int nbrLegs;

    public Terrestres(String nom, int age, int nbrLegs) {
        super(nom, age);
        this.nbrLegs = nbrLegs;
    }

    public Terrestres() {
        super("", 0);
        this.nbrLegs = 0;
    }

    public int getNbrLegs() {
        return nbrLegs;
    }

    public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString() {
        return super.toString() + " - Nombre de pattes : " + nbrLegs;
    }
}

