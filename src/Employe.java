public class Employe implements Comparable<Employe> {
    private int id;
    private String nom;
    private String prenom;
    private String nomDepartement;
    private int grade;

    // Constructeur sans paramètre
    public Employe() {
    }

    // Constructeur avec paramètres
    public Employe(int id, String nom, String prenom, String nomDepartement, int grade) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.nomDepartement = nomDepartement;
        this.grade = grade;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNomDepartement() {
        return nomDepartement;
    }

    public int getGrade() {
        return grade;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    // Redéfinition de equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Employe employe = (Employe) obj;
        return id == employe.id && nom.equals(employe.nom);
    }

    //  MÉTHODE hashCode() À AJOUTER
    @Override
    public int hashCode() {
        return 31 * id + nom.hashCode();
    }

    // Redéfinition de toString
    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", nomDepartement='" + nomDepartement + '\'' +
                ", grade=" + grade +
                '}';
    }

    // Implémentation de Comparable pour le tri par ID
    @Override
    public int compareTo(Employe autre) {
        return Integer.compare(this.id, autre.id);
    }
}
