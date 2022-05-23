import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        RegleSimple R1 = new RegleSimple("P", "Q");
        RegleSimple R2 = new RegleSimple("Q", "R");
        RegleSimple R3 = new RegleSimple("T", "R");

        ArrayList<String> BF = new ArrayList<String>();
        ArrayList<RegleSimple> BR = new ArrayList<RegleSimple>();

        BR.add(R1);
        BR.add(R2);
        BR.add(R3);

        BF.add("P");


        MoteurInference moteurInference = new MoteurInference();
        System.out.println(moteurInference.chainageAvant(BF, BR, "R"));
        System.out.println(moteurInference.chainageAvant(BF, BR, "F"));




    }
}
