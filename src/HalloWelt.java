public class HalloWelt {
    public static void main(String[] args){
        System.out.println("Hallo Welt");
        var zahl = 4;
        System.out.println(zahl);
        var test = "Hallo";
        System.out.println(test.getClass());
        System.out.println(((Object)zahl).getClass());
    }
    static int test(int a, int b){
        var c = 0;
        c = a + b;
        return c;
    }
}
