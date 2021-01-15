package animal;

public class TestAnimal {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.run(600);
        dog.jump(1);
        dog.jump(2);
        dog.run(600);

        cat.jump(2);
        cat.jump(3);
        cat.run(300);
        cat.run(200);
        cat.swim(32);
//pp
    }
}
