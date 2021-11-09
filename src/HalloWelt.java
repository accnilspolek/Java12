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
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[0]);
        while(true){
            System.out.println("Hallo");
            break;
        }
        int day = 1;
        switch (day){
            case 1 :
                System.out.println("Moin meister");
                break;
        }
        return c;
    }
}
