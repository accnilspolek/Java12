import java.util.Scanner;
public class Aufgaben150920214 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Berechnung der Summe der Reihe:\n1*1+2*2+3*3+..+n*n\nGeben Sie eine pos. ganze Zahl ein (n):");
        int input = s.nextInt();
        input++;
        int gesammt = 0;
        int i=0;
        for (; i<input; i++){
            gesammt+=i*i;
        }
        System.out.println("Summe ist: "+gesammt);
    }
}
