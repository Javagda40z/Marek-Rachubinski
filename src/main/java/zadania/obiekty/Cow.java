package zadania.obiekty;

public class Cow implements Animals {
    public void dajeMleko(){
        // krowy dają mleko
    }

    @Override
    public void makeSound() {
        System.out.println("MUUUU!");
    }
}
