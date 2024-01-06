package phase2Services;

import phase1.Filiere;

import java.util.ArrayList;
import java.util.List;

public class FiliereServices {
    private List<Filiere> filieres = new ArrayList<>();
    public void addFiliere (Filiere filiere){
        filieres.add(filiere);
    }
    public void deleteFiliere (Filiere filiere){
        filieres.remove(filiere);
    }
    public void modifyFiliere (Filiere newFiliere, Filiere oldFiliere){
        int i= filieres.indexOf(oldFiliere);
        if(i==-1) System.out.println("la filiere n'existe pas !");
        else{
            oldFiliere=newFiliere;
        }
    }
}
