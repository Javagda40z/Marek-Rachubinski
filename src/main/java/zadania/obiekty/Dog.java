package zadania.obiekty;

public class Dog implements Animals{
    public void aportuj(){
        // pies aportuje
    }

    @Override
    public void makeSound() {
        System.out.println("HAU!");
    }
}
