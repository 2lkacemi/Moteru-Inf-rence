import java.util.ArrayList;
import java.util.Scanner;

public class MoteurInference {

    public MoteurInference() {
    }

    public static boolean chainageAvant(ArrayList<String> BF, ArrayList<RegleSimple> BR, String PropVerif){
        while (!BF.contains(PropVerif)&& !BR.isEmpty()){
            for (int i=0; i< BR.size(); i++) {
                if (BF.contains(BR.get(i).getPremisse())){
                    BF.add(BR.get(i).getConclusion());
                    BR.remove(BR.get(i));
                }
            }
        }
        if (BF.contains(PropVerif)){
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean ChainageAvantComp(ArrayList<String> BF, ArrayList<RegleComposee> BR, String PropVerif){
        //vérifier si base de fait ne contient pas la prop à verif + non vide
        while (!BF.contains(PropVerif)&& !BR.isEmpty()){
            // on va boucler sur la base de régles
            for (int i=0; i< BR.size(); i++) {
                //si la base de faits contient les deux sous-régles
                if (BF.contains(BR.get(i).getPremisses()[0]) && BF.contains(BR.get(i).getPremisses()[1])){
                    //on ajoute la conclusion à la base de régles
                    BF.add(BR.get(i).getConclusion());
                    BR.remove(BR.get(i));
                }
            }
        }
        if (BF.contains(PropVerif)){
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean chainageArriere(ArrayList<String> BF, ArrayList<RegleSimple> BR, String PropVerif){
        // si la PropVerif figure dans la BF
        if (BF.contains(PropVerif)){
            return true;
        }
        //sinon
        else {
            //on boucle sur Base des régles
            for (int i=0; i< BR.size(); i++) {
                //si la PropVerif est l'une des conclusion d'une régle
                if (BR.get(i).getConclusion() == PropVerif){
                    //on applique le chainage arriere sur la premisse de la régle
                    return chainageArriere(BF, BR, BR.get(i).getPremisse());
                }
                // s'il ne trouve pas de régles à appliquer, il doit vérifier avec utilisateur la véracité de la premisse
                else{
                    System.out.println("la régle n'existe pas, vous penser que "+ BR.get(i).getPremisse() + " est vraie ou fausse");
                    System.out.println("taper 1 si vraie, 0 sinon");
                    Scanner scanner = new Scanner(System.in);
                    int val = scanner.nextInt();
                    if (val == 1){
                        chainageArriere(BF, BR, BR.get(i).getPremisse());
                    }
                    else
                        break;
                }
            }
        }
        return false;
    }

}
