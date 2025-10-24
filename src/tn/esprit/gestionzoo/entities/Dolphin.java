package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatiques {
    private float swimmingSpeed;

    public Dolphin(String nom, int age, String habitat, float swimmingSpeed) {
        super(nom, age, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    public Dolphin() {
        super();
        this.swimmingSpeed = 0f;
    }

    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public void swim() {
        System.out.println("This dolphin is swimming at " + swimmingSpeed + " km/h.");
    }

    @Override
    public String toString() {
        return super.toString() + " - Vitesse de nage : " + swimmingSpeed + " km/h";
    }
}


