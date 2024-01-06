package phase2Services;

import phase1.Module;

import java.util.ArrayList;
import java.util.List;

public class ModuleServices {
    private List<Module> modules = new ArrayList<>();
    public void addModule (Module module){
        modules.add(module);
    }
    public void deleteModule (Module module){
        modules.remove(module);
    }
    public void modifyModule (Module newModule, Module oldModule){
        int i= modules.indexOf(oldModule);
        if(i==-1) System.out.println("le module n'existe pas !");
        else{
            oldModule=newModule;
        }
    }
}
