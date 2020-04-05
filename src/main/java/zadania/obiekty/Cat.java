package zadania.obiekty;

public class Cat implements Animals {
    public void drap(){
        //kot drapie
    }
    @Override
    public void makeSound() {
        System.out.println("Miau");
    }
}
