package animal;

public class Cat extends Animal {
int maxjump;
             public Cat() {
                 maxjump = Math.random() > 0.5 ? 2:3;
             }
    @Override
    public boolean run(int distance) {
        if (distance <= 200) {
            System.out.println(true + " Кошка пробежала ");
            return true;
        }
        System.out.println(false + " Кошка не может пробежать такое расстояние");
        return false;
    }

    @Override
    public boolean jump(int height) {
        if (height<=maxjump) {
            System.out.println(true + " Кошка прыгнула");
            return true;
        }
        System.out.println(false + " Кошка не может прыгнуть так высоко");
        return false;
    }

    @Override
    public boolean swim(int distance) {
        System.out.println("Кошка не умеет плавать");
        return false;
    }
}
