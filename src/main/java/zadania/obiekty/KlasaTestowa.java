package zadania.obiekty;

import java.util.ArrayList;
import java.util.List;

public class KlasaTestowa {
    public static void main(String[] args) {

        Animals[] zwierzeta = new Animals[5];
        List<Animals> zwierz2 = new ArrayList<>();

        zwierzeta[0] = new Cat();
        zwierzeta[1] = new Cat();
        zwierzeta[2] = new Cow();
        zwierzeta[3] = new Dog();
        zwierzeta[4] = new Dog();

        zwierz2.add(new Dog());
        zwierz2.add(new Dog());
        zwierz2.add(new Cow());
        zwierz2.add(new Cow());
        zwierz2.add(new Cat());
        zwierz2.add(new Cat());

        dajGłosyDlaTablicyZwierzat(zwierzeta);
        System.out.println("\n");
        dajGłosyDlaListyZwierzat(zwierz2);

    }
    public static void dajGłosyDlaTablicyZwierzat(Animals[] zwierzeta){
        for (Animals animals : zwierzeta) {
            animals.makeSound();
        }
    }
    public static void dajGłosyDlaListyZwierzat(List<Animals> zwierzeta){
        for (Animals animals : zwierzeta) {
            animals.makeSound();
        }
    }
}
