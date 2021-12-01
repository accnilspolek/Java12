package Aufgaben24112021;

public class AnzeigenVerwaltungIU {
    public static void main (String [] args){
        Anzeige a1 = new Anzeige("Gut erhaltener Gartentisch", 20);
        a1.setRubrik("Garten");
        a1.setTitel("Gut erhaltener Gartentisch");
        a1.setBeschreibung("Gartentisch, weiß, Kunststoff");
        a1.setPreis(20);
        Inserent i1 = new Inserent();
        i1.setName("Helga Hasselbusch");
        i1.setTelNr("0641/12345");
        i1.setKtoNr(23445641);
        i1.setBlz(51550025);
        System.out.println("++++++ Anzeigeverwaltung ++++++\n\nInserent:\nName:\t\t\t"+i1.getName()+"\nTelNr:\t\t\t"+i1.getTelNr()+"\nBLZ:\t\t\t"+i1.getBlz()+"\nKtoNr:\t\t\t"+i1.getKtoNr()+"\n\nAnzeige:\nRubrik:\t\t\t"+a1.getRubrik()+"\nTitel:\t\t\t"+a1.getTitel()+"\nBeschreibung:\t"+a1.getBeschreibung()+"\nPreis:\t\t\t"+a1.getPreis()+" Euro");
    }
}
