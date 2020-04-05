package zadania.obiekty;

public class TestyNaKotach {
    public static void main(String[] args) {
        Cat kot = new Cat();
        System.out.println(kot.getLicznik());
        kot.eatMouse();
        kot.eatMouse();
        kot.eatMouse();
        kot.eatMouse();
        kot.eatMouse();
        System.out.println(kot.getLicznik());

        if(czyPowinienDostacMleko(kot)){
            System.out.println("Daje mleko dla kota");
        }
        else {
            System.out.println("Za mało zjedzonych myszy!");
        }

    }
    public static boolean czyPowinienDostacMleko (Cat cat){

        if(cat.getLicznik()>10){
            return true;
        }
        else {
            return false;
        }

    }
}
