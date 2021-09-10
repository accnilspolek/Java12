public class Aufgaben0809202123 {
    static int betrag(int x){
        if(x<0)
            return x*-1;
        return x;
    }
    public static void main(String[] args){
        System.out.println(betrag(5));
    }
}