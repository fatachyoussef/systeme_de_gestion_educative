package phase2Services;

import phase1.Departement;
import phase1.Enseignant;

import java.util.ArrayList;
import java.util.List;

public class EnseignantServices {
    private List<Enseignant> enseignants = new ArrayList<>();
    public void addEnseignant (Enseignant enseignant){
        enseignants.add(enseignant);
    }
    public void deleteEnseignant (Enseignant enseignant){
        enseignants.remove(enseignant);
    }
    public void modifyEnseignant (Enseignant newEnseignant, Enseignant oldEnseignant){
        int i= enseignants.indexOf(oldEnseignant);
        if(i==-1) System.out.println("l'enseignant n'existe pas !");
        else{
            oldEnseignant=newEnseignant;
        }
    }
}
