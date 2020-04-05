package zadania.domowe;

public class CzyArytmetyczny {
    public static void main(String[] args) {
        int[] tablicaNieArytmetyczna = new int[]{1,1,2,6,3,6,74,2};
        int[] tablicaArytmetyczna = new int[]{1,2,3,4,5,6,7,8,9};

        System.out.println(czyCiagJestArytmetyczny(tablicaNieArytmetyczna));
        System.out.println(czyCiagJestArytmetyczny(tablicaArytmetyczna));

    }
    public static boolean czyCiagJestArytmetyczny(int[] tablica){
        int[] tablicaPomocnicza = new int[tablica.length-1];
        for (int i=0;i<tablica.length-1;i++){
            tablicaPomocnicza[i]=tablica[i+1]-tablica[i];
            if(i>0){
                if(tablicaPomocnicza[i]!=tablicaPomocnicza[i-1]){
                    return false;
                }
            }
        }
        return true;
    }
}
