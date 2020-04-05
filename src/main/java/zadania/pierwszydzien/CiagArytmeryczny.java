package zadania.pierwszydzien;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CiagArytmeryczny {
    public static void main(String[] args) {
//
//        List<Integer> lista = new ArrayList<>();
//
//        lista.add(12);
//        lista.add(20);
//        lista.add(30);
//
//        System.out.println(lista);
//        lista.add(444);
//        System.out.println(lista);
//        lista.remove(0);
//        System.out.println(lista);


        System.out.println(ciagArytmetyczny(5, 1, 1));
    }
    public static List<Integer> ciagArytmetyczny(int dlugosc, int pierwszy, int roznica){
        List<Integer> ciag = new ArrayList<>();
        ciag.add(pierwszy);
        for (int i = pierwszy; i<dlugosc; i++){
            ciag.add(pierwszy + i*roznica);
        }
        return ciag;
    }
}
