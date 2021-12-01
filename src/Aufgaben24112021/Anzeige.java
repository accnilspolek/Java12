package Aufgaben24112021;

public class Anzeige {
    Anzeige(String titel, double preis){
        this.preis = preis;
        this.titel = titel;
    }
    private String rubrik;
    private String titel;
    private String beschreibung;
    private double preis;

    public String getRubrik() {
        return rubrik;
    }
    public void setRubrik(String rubrik) {
        String[] allRubrik={"Garten","Technik","PC","Haus","Küche"};
        for(String rubrikIt : allRubrik){
            if (rubrikIt.equals(rubrik)){
                this.rubrik = rubrik;
            }
        }
        if(this.rubrik == null)
            this.rubrik = "Wert nicht gesetzt";
    }
    public String getTitel() {
        return titel;
    }
    public void setTitel(String titel) {

    }
    public double getPreis() {
        return preis;
    }
    public void setPreis(double preis) {
        this.preis = preis;
    }
    public String getBeschreibung() {
        return beschreibung;
    }
    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }
}
