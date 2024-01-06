package phase2Services;

import phase1.Departement;
import phase1.Enseignant;

import java.util.ArrayList;
import java.util.List;

public class DepartementServices {
    private List<Departement> departements = new ArrayList<>();
    public void addDepartement (Departement departement){
        departements.add(departement);
    }
    public void deleteDepartement (Departement departement){
        departements.remove(departement);
    }
    public void modifyDepartement (Departement olddepartement, Departement newdepartement){
        int i= departements.indexOf(olddepartement);
        if(i==-1) System.out.println("le departement n'existe pas !");
        else{
            olddepartement=newdepartement;
        }
    }
    public void showallDepartements(){
        System.out.println("voila la liste des departements");
    }
}
