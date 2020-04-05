package zadania.pierwszydzien;

public class TabliczkaMnożenia {
    private final int liczba;

    public TabliczkaMnożenia(int liczba) {
        this.liczba = liczba;
    }

    public int getLiczba() {
        return liczba;
    }

    public void wypiszTabliczkę(){
        System.out.println("Tabliczka mnożenia dla liczby: " + liczba);
        for (int i = 1; i<=liczba; i++){
            System.out.println(liczba + " x " + i + " = " + (liczba*i));
        }
    }
}
