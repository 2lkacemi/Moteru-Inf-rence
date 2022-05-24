import java.util.ArrayList;

public class Main3 {
    public static void main(String[] args) {

        RegleComposee R1 = new RegleComposee("fleur&graine","phanerogame");
        RegleComposee R2 = new RegleComposee("phanerogame&graine nue", "sapin");
        RegleComposee R3 = new RegleComposee("phanerogame&1coty", "monocoty");
        RegleComposee R4 = new RegleComposee("phanerogame&2coty", "dicoty");
        RegleComposee R5 = new RegleComposee("monocoty&rhyzome", "muguet");
        RegleComposee R6 = new RegleComposee("dicoty", "anemone");
        RegleComposee R7 = new RegleComposee("monocoty&nonrhyzome", "lilas");
        RegleComposee R8 = new RegleComposee("feuille&fleur", "cryptogame");
        RegleComposee R9 = new RegleComposee("cryptogame&nonracine", "mousse");
        RegleComposee R10 = new RegleComposee("cryptogame&racine", "fougere");
        RegleComposee R11 = new RegleComposee("nonfeuille&plante", "thallophyte");
        RegleComposee R12 = new RegleComposee("thallophyte&chlorophylle", "algue");
        RegleComposee R13 = new RegleComposee("thallophyte&nonchlorophylle", "champignon");
        RegleComposee R14 = new RegleComposee("nonfeuille&nonfleur&nonplante", "colibacile");

        ArrayList<String> BF = new ArrayList<String>();
        ArrayList<RegleComposee> BR = new ArrayList<RegleComposee>();
        BR.add(R1);
        BR.add(R2);
        BR.add(R3);
        BR.add(R4);
        BR.add(R5);
        BR.add(R6);
        BR.add(R7);
        BR.add(R8);
        BR.add(R9);
        BR.add(R10);
        BR.add(R11);
        BR.add(R12);
        BR.add(R13);
        BR.add(R14);

        BF.add("nonfeuille");
        BF.add("chlorophylle");
        BF.add("fleur");
        BF.add("graine");
        BF.add("plante");
        //System.out.println( MoteurInference.ChainageAvantComp(BR, BF));
    }
}
