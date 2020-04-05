package zadania.pierwszydzien;

import org.apache.commons.lang3.math.NumberUtils;

import java.util.Arrays;

//    Dla zadanej tablicy 3 intów zamień miejscami pierwszy i trzeci element.
//    Przykład: zadana tablica [12, 7, 19] wynik [19, 7, 12] 5
public class Tablice {
    public static void main(String[] args) {
        int[] tablica = new int[]{1,2,3};

//        System.out.println(Arrays.toString(tablica));
//        zamienPierwszyITrzeciElement(tablica);
//        System.out.println(Arrays.toString(tablica));

        int[] nieposortowanaTablica = new int[]{1,3,3,2,6,4,9};
        System.out.println(Arrays.toString(nieposortowanaTablica));
        Arrays.sort(nieposortowanaTablica);
        System.out.println(Arrays.toString(nieposortowanaTablica));


        int dlugosc = nieposortowanaTablica.length;
        System.out.println("Najmniejsza wartość to: " + nieposortowanaTablica[0] + "\n" +
                "Największa wartość to: " + nieposortowanaTablica[dlugosc-1]);

        int[] innaTablica = new int[]{1,3,3,2,6,4,9};
        System.out.println(NumberUtils.max(innaTablica));
        System.out.println(Arrays.toString(innaTablica));
    }

    public static void zamienPierwszyITrzeciElement(int[] tablica){
        int zmienna = tablica[0];
        tablica[0] = tablica[2]; //odnosimy się poprzez 0 bo indeks 0 to pierwsza pozyja
        tablica[2] = zmienna;
    }
}
