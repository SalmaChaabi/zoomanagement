package tn.esprit.gestionzoo.entities;

public class Animal {
    protected String nom;
    protected int age;

    public Animal(String nom, int age) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException("Âge négatif interdit pour l'animal : " + nom);
        }
        this.nom = nom;
        this.age = age;
    }

    public Animal(String nom) throws InvalidAgeException {
        this(nom, 0);
    }

    public Animal() throws InvalidAgeException {
        this("", 0);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        if (nom == null || nom.trim().isEmpty()) {
            throw new IllegalArgumentException("Nom vide interdit !");
        }
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Âge négatif interdit !");
        }
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Animal)) return false;
        Animal other = (Animal) obj;
        return this.nom.equalsIgnoreCase(other.nom);
    }

    @Override
    public String toString() {
        return nom + " (âge : " + age + ")";
    }
}