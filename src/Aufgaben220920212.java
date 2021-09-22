import java.util.Scanner;

public class Aufgaben220920212 {
    static Scanner s;
    public static void main(String[] args){
        s = new Scanner(System.in);
        int input, anzahl = 0, ungültig = 0, zäler = 0;
        int stimmen[] = new int[40];
        System.out.println("Der Programmlauf sieht wie folgt aus (Ausschnitt):");
        while(true){
            System.out.print("Bitte Nummer des Kandidaten eingeben (Ende: Nummer >= 100): ");
            input = s.nextInt();
            if(input>40){
                ungültig++;
                if(input>=100) {
                    ungültig--;
                    break;
                }
            }
            anzahl++;
            input--;
            stimmen[input] += 1;
        }
        for (int kanidat: stimmen) {
            zäler++;
            System.out.println("Kandidat mit der Nummer " + zäler + " erhielt " + kanidat + " Stimme(n)");
        }
        System.out.print("Ungültige Stimmen: " + ungültig + "\nAbgegebene Stimmen: " + anzahl);
    }
}
