package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatiques implements Omnivore<Food> {
    private float swimmingDepth;

    public Penguin(String nom, int age, String habitat, float swimmingDepth) throws InvalidAgeException {
        super(nom, age, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    public Penguin() throws InvalidAgeException {
        super();
        this.swimmingDepth = 0f;
    }

    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public void swim() {
        System.out.println(getNom() + " nage à une profondeur de " + swimmingDepth + " mètres.");
    }

    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH)
            System.out.println(getNom() + " mange du poisson !");
        else
            System.out.println(getNom() + " ne mange pas de plantes uniquement.");
    }

    @Override
    public void eatPlant(Food plant) {
        if (plant == Food.PLANT || plant == Food.BOTH)
            System.out.println(getNom() + " picore des algues.");
        else
            System.out.println(getNom() + " ne mange pas que de la viande.");
    }

    @Override
    public void eatPlantAndMeat(Food food) {
        if (food == Food.BOTH)
            System.out.println(getNom() + " mange du poisson et des algues !");
        else
            System.out.println(getNom() + " ce repas n’est pas mixte.");
    }

    @Override
    public String toString() {
        return super.toString() + " - Profondeur de nage : " + swimmingDepth + " m";
    }
}
