package services;

import models.ModuleInfo;
import models.Professeur;

public class ServiceFormationMaitres {

    public static void attribuerModules(Professeur[] professeurs, ModuleInfo[] module) {//static car dans le diagrame elle et souligner.
        if (professeurs != null && module != null) {
            for (int i = 0; i < professeurs.length; i++) {
                boolean tirageReussie = true;
                while (tirageReussie) {
                    int nbre = (int) (Math.random() * (module.length - 1 + 1)); // je ne rajoute pas le plus 1 car le tableux vas de 0 a module.lenght - 1
                    if (professeurs[i].enseigneCeModule(module[nbre].getNom())) {
                        professeurs[i].ajouterModuleEnseigne(module[nbre]);
                        tirageReussie = false;
                    }
                }
            }
        }
    }

    public static boolean tousModulesCouverts(Professeur[] profs, ModuleInfo[] module) { //static car dans le diagrame elle et souligner.
        boolean toutModulesCouvert = false;
        int nbrModulesCouvert = 0;
        if (profs != null && module != null) {
            for (int i = 0; i < module.length; i++) {
                for (int index = 0; index < profs.length; index++) {
                    if (profs[index].enseigneCeModule(module[i].getNom())) {
                        nbrModulesCouvert++;
                        break;
                    }
                }

            }
            if (nbrModulesCouvert == module.length) {
                toutModulesCouvert = true;
            }
        }
        return toutModulesCouvert;
    }
}
