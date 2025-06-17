package app;

import models.Horaire;
import models.ModuleInfo;
import models.Professeur;

public class App {

    public static final String[] NOMS_MODULES = {"G300", "187", "162", "123", "293", "117", "164", "216", "106", "231", "122", "431"};

    public static void main(String[] args) {

        Horaire horaire = new Horaire();
        ModuleInfo[] modules1ere = new ModuleInfo[12];
        ModuleInfo g300 = new ModuleInfo("G300");
        ModuleInfo m187 = new ModuleInfo("187");
        ModuleInfo m162 = new ModuleInfo("162");
        ModuleInfo m123 = new ModuleInfo("123");
        ModuleInfo m293 = new ModuleInfo("293");
        ModuleInfo m117 = new ModuleInfo("117");
        ModuleInfo m164 = new ModuleInfo("164");
        ModuleInfo m216 = new ModuleInfo("216");
        ModuleInfo m106 = new ModuleInfo("106");
        ModuleInfo m231 = new ModuleInfo("231");
        ModuleInfo m122 = new ModuleInfo("122");
        ModuleInfo m431 = new ModuleInfo("431");

        modules1ere[0] = g300;
        modules1ere[1] = m187;
        modules1ere[2] = m162;
        modules1ere[3] = m293;
        modules1ere[4] = m117;
        modules1ere[5] = m123;
        modules1ere[6] = m164;
        modules1ere[7] = m216;
        modules1ere[8] = m106;
        modules1ere[9] = m231;
        modules1ere[10] = m122;
        modules1ere[11] = m431;

        Professeur[] profs = new Professeur[5];
        boolean toutModulesCouvert = false;
        for (int i = 0; i < profs.length; i++) {
            while (condition)
             {
                
            }


    
 
        }
        
    }

}


// DateFormatter formatter = new DateFormatter();
//System.out.println( "Horaire 1ère année CFC Informaticien (version du à " + LocalDateTime.now()   );
