package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatiques {
    private float swimmingDepth;

    public Penguin(String nom, int age, String habitat, float swimmingDepth) {
        super(nom, age, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    public Penguin() {
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
        System.out.println("This penguin is swimming at a depth of " + swimmingDepth + " meters.");
    }

    @Override
    public String toString() {
        return super.toString() + " - Profondeur de nage : " + swimmingDepth + " m";
    }
}

