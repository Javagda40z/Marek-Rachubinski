package pętle;

public class Loops {
    public static void main(String[] args) {
//        for (int i=0;i<=100;i++){
//            System.out.println(i);
//        }
//
//        System.out.println("\n");
//
//        for (int i=100;i>=0;i--){
//            System.out.println(i);
//        }
//
//        System.out.println("\n");
//
//        for (int i=300; i<=1000; i++){
//            if (i%3==0){
//                System.out.println(i);
//            }
//        }
//
//        System.out.println("\n");

//        for (int i=123; i<=15000; i++){
//            if (i%2==0&&i%3==0){
//                System.out.println(i);
//            }
//        }
        String napis = "Jestem na dobrej drodze do zostania profesjonalnym programistą JAVA";
//        for (int i=1;i<=10;i++){
//            System.out.println("nr: "+ i + napis);
//        }

//        for (int i=0; i<=napis.length(); i++){
//            if(i%2==0) {
//                System.out.print(napis.charAt(i));
//            }
//        }
//        for (int i = napis.length()-1;i>=0;i--){
//            System.out.print(napis.charAt(i));
//        }
//        while(true){
//            System.out.println("Hello World");
//        }
//        dodawanie(0,1,5);
        Prostokąt(3,5);
    }
    public static void Prostokąt(int a, int b){
        for (int i=1; i<=a;i++){
            System.out.println();
            for (int j=1; j<=b; j++){
                System.out.print("*");
            }
        }
    }
//    public static void dodawanie(int a, int b, int c){
//        int suma = 0;
//        while (suma<c){
//            suma+=a+b;
//        }
//        System.out.println(suma);
//
//    }
}
