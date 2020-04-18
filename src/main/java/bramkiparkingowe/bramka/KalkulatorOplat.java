package bramkiparkingowe.bramka;

import bramkiparkingowe.pojazdy.Pojazd;
import bramkiparkingowe.util.KalkulatorUtil;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import static bramkiparkingowe.pojazdy.Paliwo.PRAD;

public class KalkulatorOplat {

    public static int OPLATA = 2;

    public int policz(Wjazd wjazd){
        LocalDateTime dataWjazdu = wjazd.getDataWjazdu();
        LocalDateTime dataWyjazdu = LocalDateTime.now();
        Pojazd pojazd = wjazd.getPojazd();
        long czasNaParkingu = ChronoUnit.HOURS.between(dataWjazdu, dataWyjazdu); //może też być duration
        //testowo
        czasNaParkingu = czasNaParkingu + KalkulatorUtil.randomHourBetween(1,24);
        //
        if(czasNaParkingu<1||PRAD.equals(pojazd.getPaliwo())){
            return 0;
        }
        double mnoznik = policzMnoznik(pojazd);
        return (int)(OPLATA*mnoznik*czasNaParkingu);
        }

    private double policzMnoznik(Pojazd pojazd) {
        double mnoznik = 1;
        switch (pojazd.getTyp()){
            case OSOBOWY:
                mnoznik*=1;
                break;
            case MOTOCYKL:
                mnoznik*=0.5;
                break;
            case CIEZAROWY:
                mnoznik*=2;
                break;
            default:
                break;
        }

        return mnoznik;
    }
}
