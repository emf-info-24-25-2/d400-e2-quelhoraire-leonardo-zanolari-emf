package models;

public class Horaire {

    public static final int NBRE_DE_BLOCS = 6;
    private Bloc[] blocs;

    public Horaire() {
        blocs = new Bloc[6];
    }

    public boolean planifier(ModuleInfo[] module, Professeur[] profs) {
        boolean reussie = false;
        int modulesreussie = 0;
        for (int i = 0; i < module.length; i++) {
            for (int j = 0; j < profs.length; j++) {
                if (profs[j].enseigneCeModule(module[i].getNom())) {
                    module[i].setProfesseur(profs[j]);
                    modulesreussie++;
                    break;

                }
            }
        }
        if (modulesreussie == module.length) {
            reussie = true;
        }
        return true;
    }

    public void afficherHoraire() {
        for (int i = 0; i < blocs.length; i++) {
            blocs[i].afficherHoraire();
        }
    }

    public Bloc moduleDansQuelBloc(ModuleInfo module) {
        Bloc blocoucetrouvelemodule = new Bloc(null);
        if (module != null) {
            for (int i = 0; i < blocs.length; i++) {
                if (blocs[i].contientModule(module)) {
                    blocoucetrouvelemodule = blocs[i];
                }
            }
        }
        return blocoucetrouvelemodule;
    }

}
