import java.util.Scanner;
public class Aufgaben150920212 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        double gesammt=0,input,zaeler=0;
        System.out.println("SummeUndDurchschnitt");
        do {
            System.out.print("Zahl (Ende mit 0): ");
            input = s.nextDouble();
            zaeler++;
            gesammt+=input;
        }while(input != 0);
        System.out.println("Summe: "+gesammt+"; Durchschnitt "+gesammt/zaeler);
    }
}
