package phase2Services;

import phase1.Departement;
import phase1.Enseignant;
import phase1.Filiere;
import java.util.ArrayList;
public class FiliereServices {
    public static Filiere addFiliere(String intitule, Enseignant chef, Departement dept) {
        Filiere newFiliere = new Filiere(intitule, chef, dept);
        DB.filieres.add(newFiliere);
        return newFiliere;
    }
    public static Filiere updateFiliere(int id, String intitule, Enseignant chef, Departement dept) {
        for (Filiere filiere : DB.filieres) {
            if (filiere.getId() == id) {
                filiere.setIntitule(intitule);
                filiere.setChef(chef);
                filiere.setDept(dept);
                return filiere;
            }
        }
        return null;
    }
    public static ArrayList<Filiere> deleteFiliereById(int id){
        Filiere toRemove = getFiliereById(id);
        if (toRemove != null) {
            DB.filieres.remove(toRemove);
        }
        return DB.filieres;
    }
    public static Filiere getFiliereById(int id){
        for (Filiere filiere : DB.filieres) {
            if (filiere.getId() == id) {
                return filiere;
            }
        }
        return null;
    }
    public static ArrayList<Filiere> getAllFiliere(){
        return DB.filieres;
    }
}