package zadania.obiekty2;

import zadania.obiekty.Movable;

public abstract class Animal2 implements Movable {

    private String imie;

    public Animal2(String imie) {
        this.imie = imie;
    }

    public String getImie() {
        return imie;
    }

    abstract void makeSound();
}
