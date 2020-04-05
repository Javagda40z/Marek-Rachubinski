package zadania.obiekty;

public class Cat implements Animals {
    private int licznik;

    public void drap(){
        //kot drapie
    }

    public void eatMouse(){
        licznik++;
        System.out.println("Zjadłem " + licznik + " myszy.");
    }
    @Override
    public void makeSound() {
        System.out.println("Miau");
    }

    public int getLicznik() {
        return licznik*3; //oszukańczy getLicznik myszy dla wszystkich
    }
}
