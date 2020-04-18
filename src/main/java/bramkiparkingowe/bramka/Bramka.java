package bramkiparkingowe.bramka;

import bramkiparkingowe.pojazdy.Pojazd;

public class Bramka implements Szlaban {

    private RejestrPojazdow rejestrPojazdow;
    private KalkulatorOplat kalkulatorOplat;
    private Raport raport;


    public Bramka(RejestrPojazdow rejestrPojazdow) {
        this.rejestrPojazdow = rejestrPojazdow;
        raport = new Raport();
    }

    @Override
    public void wjazd(Pojazd pojazd) {
        boolean czyWjechal = rejestrPojazdow.wpisz(pojazd);
        if (!czyWjechal){
            zawolajPomoc(pojazd);
        }
        else {
            System.out.println("Pojazd o nr rejestracyjnym: " +
                    "" + pojazd.getRejestracja() + " wjechał na parking.");
        }
    }

    private void zawolajPomoc(Pojazd pojazd) {
        System.out.println("Wołam pomoc dla pojazdu o nr rejestracyjnynm: " +
                "" + pojazd.getRejestracja());
    }

    @Override
    public void wyjazd(Pojazd pojazd, int zaplata) {
        Wjazd wjazd = rejestrPojazdow.wypisz(pojazd);

        int koszt = kalkulatorOplat.policz(wjazd);
        raport.dodajPojazd(pojazd.getTyp());
        raport.dodajKase(zaplata);
        raport.dodajKoszt(koszt);

        if(koszt>zaplata){
            zawolajPomoc(pojazd);
        }
        else{
            System.out.println("Wyjeżdża pojazd o nr rejestracyjnym: " + wjazd.getPojazd().getRejestracja() + " Zapłacono: " + zaplata);
        }

    }
    public void setKalkulatorOplat(KalkulatorOplat kalkulatorOplat) {
        this.kalkulatorOplat = kalkulatorOplat;
    }
    public Raport przygotujRaport(){
        return raport;
    }
}
