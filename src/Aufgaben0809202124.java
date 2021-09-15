public class Aufgaben0809202124 {
    int plus(int x, int y){
        return Math.addExact(x, y);
    }
    int minus(int x, int y){return x-y;}
    int mal(int x, int y){
        return x*y;
    }
    int geteilt(int x, int y){
        return x/y;
    }
    int hoch2(int y){
        return y*y;
    }
    int hoch3(int y){
        return y*y*y;
    }

    public static void main(String[] args){
    Aufgaben0809202124 Rechner = new Aufgaben0809202124();
    System.out.println(Rechner.minus(7, 6));
    }
}
