import java.util.ArrayList;

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

    public static void RegleComposee(String conclusion, String[] premisses){

    }

    public MoteurInference(String premissesComposees, String réponse) {
        String[] premisses = premissesComposees.split("&");
    }







}
