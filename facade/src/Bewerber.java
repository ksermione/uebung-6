/**
 * Created by oksana.shcherban on 26.06.19.
 */
public class Bewerber {

    Teamfaehigkeit tf;
    Lernfaehigkeit lf;
    Engagement en;
    TechnischeKompetenzen tk;
    Problemloesung pl;
    Belastbarkeit bl;


    public Bewerber(int teamfaehigkeit, int lernfaehigkeit, int engagement, int technischeKompetenzen, int problemloesung, int belastbarkeit){
        tf = new Teamfaehigkeit(teamfaehigkeit);
        lf = new Lernfaehigkeit(lernfaehigkeit);
         en = new Engagement(engagement);
        tk = new TechnischeKompetenzen(technischeKompetenzen);
         pl = new Problemloesung(problemloesung);
        bl = new Belastbarkeit(belastbarkeit);
    }

    public String stelltSichVor() {
        return "Die Bewertungen sind:\n" +
                "Teamfaehigkeitpunkte: "+tf.getPunkte()+"\n"+
                "Lernfaehigkeit: "+lf.getPunkte()+"\n"+
                "Engagement: "+en.getPunkte()+"\n"+
                "TechnischeKompetenzen: "+tk.getPunkte()+"\n"+
                "Problemloesung: "+pl.getPunkte()+"\n"+
                "Belastbarkeit: "+bl.getPunkte()+"\n";
    }
}
