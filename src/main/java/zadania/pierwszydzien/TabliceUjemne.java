package zadania.pierwszydzien;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class TabliceUjemne {
    public static void main(String[] args) {
        int[] tablicaUjemna = new int[]{-2,-5,-7,-32,-4, 0, 32,89, 43, 2, -16};
        System.out.println(sumaUjemnych(tablicaUjemna));

        System.out.println(Arrays.toString(liczbyUjemne(tablicaUjemna)));

    }
    public static int sumaUjemnych(int[] tablica){
        int suma=0;
        for (int i:tablica){
            if(i<0){
                suma+=1;
            }

        }
        return suma;
    }
    public static int[] liczbyUjemne(int[] tablica){
        int[] tab = new int[0];
        for (int i:tablica){
            if(i<0){
                tab = ArrayUtils.add(tab, i);
            }
        }
        return tab;
    }
}
