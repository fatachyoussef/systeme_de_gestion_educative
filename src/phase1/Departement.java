package phase1;

import java.util.ArrayList;
public class Departement {

    private int id;
    private String intitule;
    private phase1.Enseignant chef;

    ArrayList<phase1.Filiere> filieres = new ArrayList<>();
    public Departement() {
    }
    public Departement(String intitule, Enseignant chef) {
        this.intitule = intitule;
        this.chef = chef;
    }
    public String getIntitule() {
        return intitule;
    }
    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }
    public Enseignant getChef() {
        return chef;
    }
    public void setChef(Enseignant chef) {
        this.chef = chef;
    }
    public ArrayList<Filiere> getFilieres() {
        return filieres;
    }
    public void setFilieres(ArrayList<Filiere> filieres) {
        this.filieres = filieres;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String toString() {
        return "Departement{" +
                "intitule='" + intitule + '\'' +
                '}';
    }
}