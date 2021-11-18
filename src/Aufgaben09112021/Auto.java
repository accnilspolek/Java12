package Aufgaben09112021;

public class Auto {
    private String typ;
    private int maxGesch;
    private double nullAufHundert;
    private int leistungPS;
    private int hubraum;
    private double laenge;
    private int maxUmdrehung;
    private int geschwindichkeit;

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public int getMaxGesch() {
        return maxGesch;
    }

    public void setMaxGesch(int maxGesch) {
        this.maxGesch = maxGesch;
    }

    public double getNullAufHundert() {
        return nullAufHundert;
    }

    public void setNullAufHundert(double nullAufHundert) {
        this.nullAufHundert = nullAufHundert;
    }

    public int getLeistungPS() {
        return leistungPS;
    }

    public void setLeistungPS(int leistungPS) {
        this.leistungPS = leistungPS;
    }

    public int getHubraum() {
        return hubraum;
    }

    public void setHubraum(int hubraum) {
        this.hubraum = hubraum;
    }

    public double getLaenge() {
        return laenge;
    }

    public void setLaenge(double laenge) {
        this.laenge = laenge;
    }

    public void setMaxUmdrehung(int maxUmdrehung) {
        this.maxUmdrehung = maxUmdrehung;
    }

    public int getMaxUmdrehung() {
        return maxUmdrehung;
    }

    public int getGeschwindichkeit() {
        return geschwindichkeit;
    }

    public void setGeschwindichkeit(int geschwindichkeit) {
        this.geschwindichkeit = geschwindichkeit;
    }
    public boolean fahren(int geschwindichkeit){
        if(0>geschwindichkeit || geschwindichkeit>195)
            return false;
        return true;
    }
}