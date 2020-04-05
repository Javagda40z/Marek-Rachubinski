package zadania.obiekty;

public class Vet {
    public static void main(String[] args) {
        Cat cat = new Cat("Filemon");
        Dog dog = new Dog("Burek");
        Vet vet = new Vet();
        vet.sayHello(cat);
        vet.sayHello(dog);
    }
    public void sayHello(Dog dog){
        System.out.println("Witaj "+ dog.getImie());
    }
    public void sayHello(Cat cat){
        System.out.println("Witaj "+ cat.getImie());
    }

}
