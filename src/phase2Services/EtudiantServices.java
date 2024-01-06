package phase2Services;

import phase1.Etudiant;

import java.util.ArrayList;
import java.util.List;

public class EtudiantServices {
    private List<Etudiant> etudiants = new ArrayList<>();
    public void addEtudiant (Etudiant etudiant){
        etudiants.add(etudiant);
    }
    public void deleteEtudiant (Etudiant etudiant){
        etudiants.remove(etudiant);
    }
    public void modifyEtudiant (Etudiant newEtudiant, Etudiant oldEtudiant){
        int i= etudiants.indexOf(oldEtudiant);
        if(i==-1) System.out.println("l'etudiant n'existe pas !");
        else{
            oldEtudiant=newEtudiant;
        }
    }
}
