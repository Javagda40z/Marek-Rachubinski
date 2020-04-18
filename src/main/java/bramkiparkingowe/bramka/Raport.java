package bramkiparkingowe.bramka;

import bramkiparkingowe.pojazdy.Typ;

import java.util.EnumMap;
import java.util.Map;

public class Raport {
    private int zarobek;
        private int koszty;
    private Map<Typ, Integer> licznikPojazdow = new EnumMap<Typ, Integer>(Typ.class);

    public int getKoszty() {
        return koszty;
    }

    public int getZarobek() {
        return zarobek;
    }

    public Map<Typ, Integer> getLicznikPojazdow() {
        return licznikPojazdow;
    }
    public void dodajKase(int kasa){
        zarobek += kasa;
    }
    public void dodajPojazd(Typ typ){
        if (licznikPojazdow.containsKey(typ)) {
            Integer licznik = licznikPojazdow.get(typ);
            licznik++;
            licznikPojazdow.put(typ, licznik);
        }
        else {
            licznikPojazdow.put(typ, 1);
        }
//        licznikPojazdow.compute(typ, (k,v) -> 1 + (v==null?0:v));
    }
    public void dodajKoszt(int koszt){
        this.koszty+=koszt;
    }

    public void wyswietl() {
        System.out.println("Zarobiona kasa: "+zarobek+"\nKoszt: "+koszty);
        for (Typ typ : licznikPojazdow.keySet()) { //przy pomocy entrysetu lepiej
            System.out.println("Pojazdów o type: "+typ.name()+" jest: "+licznikPojazdow.get(typ));
        }
    }
}
