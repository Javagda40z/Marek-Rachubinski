package zadania.obiekty;

public interface Animals extends Movable {

    @Override
    default void move() {
        System.out.println("idę");
    }

    void makeSound();

}
