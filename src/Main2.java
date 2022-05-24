import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {

        //Base de règles :
        //R1 : A et B → C
        //R2 : C et D → F
        //R3 : F et B → E
        //R4 : F et A → G
        //R5 : G et F → B
        //Base de faits (BF) initiale : {A, C, D}

        RegleComposee R1 = new RegleComposee("A&B", "C");
        RegleComposee R2 = new RegleComposee("C&D", "F");
        RegleComposee R3 = new RegleComposee("F&B", "E");
        RegleComposee R4 = new RegleComposee("F&A", "G");
        RegleComposee R5 = new RegleComposee("G&F", "B");


        ArrayList<String> BF = new ArrayList<String>();
        ArrayList<RegleComposee> BR = new ArrayList<RegleComposee>();

        BR.add(R1);
        BR.add(R2);
        BR.add(R3);
        BR.add(R4);
        BR.add(R5);


        BF.add("A");
        BF.add("C");
        BF.add("D");

        //System.out.println(MoteurInference.ChainageAvantComp(BF, BR, "E"));




    }
}
