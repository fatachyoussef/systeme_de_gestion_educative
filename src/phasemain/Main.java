package phasemain;

import phase3Controle.*;
import phase1.Enseignant;
import phase1.Filiere;
import phase1.Departement;
import phase2Services.DB;
import java.util.Scanner;
public class Main {

    public static java.lang.Object controllers;

    public static boolean isNull(Object ob) {
        return ob == null ;
    }
    public static int getIntInput(String... msg) {
        Scanner scan = new Scanner(System.in);
        String message = "Entrez un nombre entier : ";
        if (msg.length > 0 )
            message = msg[0] ;
        System.out.print(message);
        int num = scan.nextInt();
        return num;

    }

    public static String getStringInput(String prompt) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println(prompt);
        return scanner.nextLine();

    }

    public static float getFloatInput(String... msg) {
        Scanner scan = new Scanner(System.in);
        String message = "Enter a floating-point number: ";
        if (msg.length > 0)
            message = msg[0];
        System.out.print(message);

        float num = scan.nextFloat();

        return num;

    }
    public static void showPrincipalMenu(){
        System.out.println("-------------------------[ Bienvenu ]---------------------------");


        System.out.println("1: Pour gérer les départements");
        System.out.println("2: Pour gérer les filières");
        System.out.println("3: Pour gérer les enseignants");
        System.out.println("4: Pour gérer les modules");
        System.out.println("5: Pour gérer les étudiants");
        System.out.println("6: Pour gérer les notes");
        System.out.println("0: Pour sortir");

        int option = getIntInput("Veuillez sélectionner une option : ");
        switch(option) {
            case 1:
                DepartementsController.showMenu();
                break;
            case 2:
                FilieresController.showMenu();
                break;
            case 3:
                EnseignantsController.showMenu();
                break;
            case 4:
                ModulesController.showMenu();
                break;
            case 5:
                EtudiantsController.showMenu();
                break;
            case 6:
                NotesController.showMenu();
                break;
            default:
                System.out.println("Invalid option. Please enter a valid option.");
        }

        switch(option) {
            case 1:
                DepartementsController.showMenu();
                break;
            case 2:
                FilieresController.showMenu();
                break;
            case 3:
                EnseignantsController.showMenu();
                break;
            case 4:
                ModulesController.showMenu();
                break;
            case 5:
                EtudiantsController.showMenu();
                break;
            case 6:
                NotesController.showMenu();
                break;
            default:
                System.out.println("Invalid option. Please enter a valid option.");
        }
    }
    public static void main(String[] args) {

        showPrincipalMenu();

    }
}