package phase2Services;

import phase1.Enseignant;
import phase1.Filiere;
import phase1.Module;
import java.util.ArrayList;
public class ModuleServices {
    public static Module addModule(String intitule, Enseignant chef, Filiere filiere) {
        Module newModule = new Module(intitule, chef, filiere);
        DB.modules.add(newModule);
        System.out.println("New module added: " + newModule); // Debugging statement
        return newModule;
    }
    public static Module updateModule(int id, String intitule, Enseignant chef, Filiere filiere) {
        for (Module module : DB.modules) {
            if (module.getId() == id) {
                module.setIntitule(intitule);
                module.setChef(chef);
                module.setFiliere(filiere);
                return module;
            }
        }
        return null;
    }
    public static ArrayList<Module> deleteModuleById(int id){
        Module moduleToRemove = getModuleById(id);
        if (moduleToRemove != null) {
            DB.modules.remove(moduleToRemove);
        }
        return DB.modules;
    }
    public static Module getModuleById(int id){
        for (Module module : DB.modules) {
            if (module.getId() == id) return module;
        }
        return null;
    }
    public static ArrayList<Module> getAllModules() {
        return DB.modules;
    }
    public static void addFiliere(String intitule, Enseignant ensById, Filiere filiereById) {
    }
    public static void updateFiliere(int id, String intitule, Enseignant ensById, Filiere filiereById) {
    }
}