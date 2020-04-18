package bramkiparkingowe;

import bramkiparkingowe.bramka.Bramka;
import bramkiparkingowe.bramka.KalkulatorOplat;
import bramkiparkingowe.bramka.Raport;
import bramkiparkingowe.bramka.RejestrPojazdow;
import bramkiparkingowe.pojazdy.Autobus;
import bramkiparkingowe.pojazdy.Motocykl;
import bramkiparkingowe.pojazdy.Paliwo;
import bramkiparkingowe.pojazdy.Samochod;

public class Application {
    public static void main(String[] args) {
        RejestrPojazdow rejestrPojazdow = new RejestrPojazdow();
        Bramka bramka = new Bramka(rejestrPojazdow);
        bramka.setKalkulatorOplat(new KalkulatorOplat());
        Motocykl motocykl = new Motocykl("GD32490", Paliwo.BENZYNA);
        Samochod samochod = new Samochod("GD3248B", Paliwo.BENZYNA);
        Autobus autobus = new Autobus("GD2137X", Paliwo.BENZYNA);

        bramka.wjazd(motocykl);
        bramka.wjazd(samochod);
        bramka.wjazd(autobus);

        bramka.wyjazd(samochod, 10);
        bramka.wyjazd(autobus,100);

        bramka.wjazd(samochod);
        bramka.wjazd(motocykl);

        Raport raport = bramka.przygotujRaport();

        raport.wyswietl();
    }
}
