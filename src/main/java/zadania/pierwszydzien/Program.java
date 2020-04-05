package zadania.pierwszydzien;

public class Program {
    public static void main(String[] args) {
//        Program program = new Program();
//        program.tabliczkaMnożenia(5);
//        program.tabliczkaMnożenia(10);

        TabliczkaMnożenia tabliczkaMnożenia = new TabliczkaMnożenia(5);
        System.out.println(tabliczkaMnożenia.getLiczba());
        tabliczkaMnożenia.wypiszTabliczkę();

        tabliczkaMnożenia = new TabliczkaMnożenia(8);
        System.out.println(tabliczkaMnożenia.getLiczba());
        tabliczkaMnożenia.wypiszTabliczkę();


    }
//    public void tabliczkaMnożenia(int liczba){
//        for (int i = 1; i<=liczba; i++){
//            System.out.println(liczba + " x " + i + " = " + (liczba*i));
//        }
//    }
}
