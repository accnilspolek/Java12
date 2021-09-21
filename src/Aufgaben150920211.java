import java.util.Scanner;
public class Aufgaben150920211 {
    static Scanner s;
    public static void main (String[] args){
        s = new Scanner(System.in);
        System.out.print("Berechnung der Summe 1+2+3+4+... bis zum Grenzwert\nGrenzwert:");
        int input, zaeler = 0, summe=0;
        input = s.nextInt();
        while(input>summe){
            zaeler++;
            summe+=zaeler;
        }
        System.out.println("Nach " + zaeler + " Gliedern ist " + input + " erreicht. Die Summe ist " + summe + ".");
    }
}
