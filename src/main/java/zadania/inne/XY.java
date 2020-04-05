package zadania.inne;

public class XY {
    public static void main(String[] args) {
        System.out.println(LiczbyBezXY(3, 7));
        System.out.println(LiczbyZXY(3, 7));
        System.out.println(LiczbyodXdoY(3,7));
    }
    public static int LiczbyBezXY(int X, int Y){
        int suma=0;
        for (int i=X+1;i<Y;i++){
            suma+=i;
        }
        return suma;
    }
    public static int LiczbyZXY(int X, int Y){
        int suma=0;
        for (int i=X;i<=Y;i++){
            suma+=i;
        }
        return suma;
    }
    public static int LiczbyodXdoY(int X, int Y){
        int suma=0;
        for (int i=X;i<Y;i++){
            suma+=i;
        }
        return suma;
    }
}
