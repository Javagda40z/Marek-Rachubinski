package bramkiparkingowe.bramka;

import bramkiparkingowe.pojazdy.Pojazd;

public interface Szlaban {

    void wjazd(Pojazd pojazd);
    void wyjazd(Pojazd pojazd, int zaplata);
}
