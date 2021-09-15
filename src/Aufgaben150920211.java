import java.util.Scanner;
public class Aufgaben150920211 {
    static Scanner s;
    public static void main (String[] args){
        s = new Scanner(System.in);
        System.out.print("Geben sie eine Zahl ein :");
        int input = s.nextInt();
        int outZahl = 0;
        String output = "Berechnung der Summe 0";
        int i = 1;
        for(;i<input; i++){
            output=output+"+"+i;
            outZahl += i;
        }
        output += "+"+i;
        output+=" bis zum Grenzwert";
        System.out.println(output);
        System.out.println("Grenzwert: " + i);
        System.out.println("Nach "+ input + " Gliedern ist " + i + " erreicht. Die Summe ist " + outZahl + ".");
    }
}
