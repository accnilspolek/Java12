import java.util.Scanner;
public class Aufgaben150920215 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Form2");
        System.out.print("Anzahl der Zeilen (max. 10):");
        int input1 = s.nextInt();
        System.out.print("Anzahl der Zeilen (max. 15):");
        int input2 = s.nextInt();
        input1 =(input1>10)? 10:input1;
    }
}
