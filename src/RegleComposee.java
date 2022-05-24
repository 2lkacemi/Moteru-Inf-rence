import java.util.ArrayList;

public class RegleComposee {

    private String conclusion;
    private String[] premisses;

    public RegleComposee() {
    }

    public RegleComposee(String premissesComposees, String réponse){
        String[] premisses = premissesComposees.split("&");
        this.conclusion = réponse;
    }

    public RegleComposee(String conclusion, String[] premisses) {
        this.conclusion = conclusion;
        this.premisses = premisses;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    public String[] getPremisses() {
        return premisses;
    }

    public void setPremisses(String[] premisses) {
        this.premisses = premisses;
    }
}
