package StringiEqualsyHashcody;

public class Czlowiek {

    private String imie;
    private int wiek;

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public Czlowiek(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Czlowiek czlowiek = (Czlowiek) o;

        if (wiek != czlowiek.wiek) return false;
        return imie.equals(czlowiek.imie);
    }

    //jeżeli equals zwraca true to hashcode jest taki sam dla porównywanych obiektow
    //jeżeli hashcode jest równy, to equals nie musi zwracać true
    //hashcode jest zawsze taki sam dla niezmienionych danych

    @Override
    public int hashCode() {
        int result = imie.hashCode();
        result = 31 * result + wiek;
        return result;
    }
}
