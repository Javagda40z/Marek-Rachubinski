package zadania.obiekty;

public class Dog implements Animals{
    public String imie;

    public Dog(){}

    public String getImie() {
        return imie;
    }

    public Dog(String imie) {
        this.imie = imie;
    }

    public void aportuj(){
        // pies aportuje
    }

    @Override
    public void makeSound() {
        System.out.println("HAU!");
    }
}
