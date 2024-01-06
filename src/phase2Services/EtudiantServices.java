package phase2Services;

import phase1.Etudiant;
import phase1.Filiere;
import java.util.ArrayList;
public class EtudiantServices {
    public static Etudiant addEtd(String nom, String prenom, String email, int apogee, String filiere) {

        Etudiant nouvelEtudiant = new Etudiant(nom, prenom, email, apogee, new Filiere(filiere));
        DB.etudiants.add(nouvelEtudiant);
        return nouvelEtudiant;
    }
    public static Etudiant updateEtd(int id, String nom, String prenom, String email, int apogee, Filiere filiere) {

        Etudiant etudiant = getEtdById(id);
        if (etudiant != null) {
            etudiant.setNom(nom);
            etudiant.setPrenom(prenom);
            etudiant.setEmail(email);
            etudiant.setApogee(apogee);
            etudiant.setFiliere(filiere);
        }
        return etudiant;
    }
    public static ArrayList<Etudiant> deleteEtdById(int id) {

        Etudiant etudiant = getEtdById(id);
        if (etudiant != null) {
            DB.etudiants.remove(etudiant);
        }
        return DB.etudiants;
    }
    public static Etudiant getEtdById(int id) {
        for (Etudiant etudiant : DB.etudiants) {
            if (etudiant.getId() == id) {
                return etudiant;
            }
        }
        return null;
    }
    public static ArrayList<Etudiant> getAllEtd(){
        return  DB.etudiants;
    }
}