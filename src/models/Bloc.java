package models;

import java.time.DayOfWeek;

public class Bloc {

    public static final int NBRE_DEMI_JOURS_SEMAINE = 10; //static car dans le diagrame elle et souligner et final car elle et en majuscule donc elle et invariable.
    private String nom;
    private ModuleInfo[] modules;

    public Bloc(String nom) {
        this.nom = nom;
        modules = new ModuleInfo[10];
        ModuleInfo matu = new ModuleInfo("matu");
        for (int i = 0; i < 5; i++) {
            modules[i] = matu;
        }
    }

    public boolean planifierModule(ModuleInfo module) {
        boolean reussie = false;
        if (module != null) {
            int placemise = 3;
            for (int i = 0; i < modules.length; i++) {
                if (modules[i] != null) {
                    placemise++;
                    modules[i] = module;
                }
                if (placemise == 3) {
                    reussie = reussie;
                    break;
                }
            }
        }

        return reussie;
    }

    public void afficherHoraire() {
        int index = 0;
        int jour = 0;
        boolean matin = true;
        for (int i = 0; i < modules.length; i++) {
            System.out.println(DayOfWeek.values()[jour]);
            if (matin) {
                System.out.println("matin      : " + modules[i]);
                matin = false;
            } else {
                System.out.println("après midi : " + modules[i]);
            }
            index++;
            if (index == 2) {
                matin = true;
                index = 0;
                jour++;
            }
        }
    }

    public boolean estTotalementPlanifie() {
        boolean totalementPlanifie = true;
        for (int i = 0; i < modules.length; i++) {
            if (modules[i] == null) {
                totalementPlanifie = false;
                break;
            }
        }
        return totalementPlanifie;
    }

    public boolean contientModule(ModuleInfo module) {
        boolean moduleTrouver = false;
        for (int i = 0; i < modules.length; i++) {
            if (modules[i] == module) {
                moduleTrouver = true;
                break;
            }
        }
        return moduleTrouver;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return "nom du bloc" + nom;
    }

}
