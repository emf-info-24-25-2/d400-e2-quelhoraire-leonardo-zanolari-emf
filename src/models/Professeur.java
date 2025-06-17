package models;

public class Professeur {

    private String nom;
    private String prenom;
    private ModuleInfo[] modulesEnseignes;

    public Professeur(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        modulesEnseignes = new ModuleInfo[0];
    }

    public boolean enseigneCeModule(String nomDuModule) {
        boolean enseigne = false;
        if (nomDuModule != null) {
            for (int i = 0; i < modulesEnseignes.length; i++) {
                if (modulesEnseignes[i].getNom() == nomDuModule) {
                    enseigne = true;
                    break;
                }
            }

        }

        return enseigne;
    }

    public void ajouterModuleEnseigne(ModuleInfo module) {
        if (module != null) {
//pas besoin de controler si le module et deja present car ces deja fait sur serviceformatiomaitre
            ModuleInfo[] nouveuxModuleEnseignes = new ModuleInfo[modulesEnseignes.length + 1];
            nouveuxModuleEnseignes[nouveuxModuleEnseignes.length - 1] = module;
            for (int i = 0; i < nouveuxModuleEnseignes.length - 1; i++) {
                nouveuxModuleEnseignes[i] = modulesEnseignes[i];
            }
            modulesEnseignes = nouveuxModuleEnseignes;
        }

    }

    public void viderModules() {
        for (int i = 0; i < modulesEnseignes.length; i++) {
            modulesEnseignes[i].setProfesseur(null);
        }
        ModuleInfo[] tabModuleVide = new ModuleInfo[0];
        modulesEnseignes = tabModuleVide;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public ModuleInfo[] getModulesEnseignes() {
        return modulesEnseignes;
    }

    @Override
    public String toString() {

        return prenom + " " + nom.toUpperCase();
    }

}
