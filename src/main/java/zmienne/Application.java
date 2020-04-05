package zmienne;

public class Application {
    public static void main(String[] args) {
        int i;
        double d;
        float f;
        i = 325;
        d = 98347d;
        f = 3.3234f;


        System.out.println(i);
        System.out.println(d);
        System.out.println(f);
        double zmienna4 = i*d;


        System.out.println(zmienna4);

        double zmienna = 3.17;

        int nowazmienna = (int) zmienna; //Jest 3 ponieważ int jest bezprzecinkowy i ucina wszystko za przecinkiem

        System.out.println(nowazmienna + "\n");

        System.out.println(dodaj(5,5));
        System.out.println(odejmij(10,2));
        System.out.println(pomnóż(5,5));
        System.out.println(podziel(5,2));
        System.out.println(czyParzyste(2));
    }
    public static int dodaj(int a, int b){
        return (a+b);
    }
    public static int odejmij(int a, int b){
        return (a-b);
    }
    public static int pomnóż(int a, int b){
        return (a*b);
    }
    public static double podziel(int a, int b){
        return ((double)a/b);
    }
    public static boolean czyParzyste(int a){
        return a % 2 == 0;
    }
}
