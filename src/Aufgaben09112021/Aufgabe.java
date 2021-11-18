package Aufgaben09112021;
public class Aufgabe {
    public static void updateScreen(String typ, int geschwindichkeit, double nullAufHundert){
        System.out.println(typ);
        System.out.println("Geschwindichkeit :\t\t"+geschwindichkeit);
        System.out.println("Null auf Hundert :\t\t"+nullAufHundert);
    }
    public static void main(String[]args){
        Auto car = new Auto();
        car.setGeschwindichkeit(180);
        car.setTyp("BMW");
        car.setNullAufHundert(3.8);
        updateScreen(car.getTyp(),car.getGeschwindichkeit(),car.getNullAufHundert());
    }
}
