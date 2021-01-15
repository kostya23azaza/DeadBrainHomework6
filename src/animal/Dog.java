package animal;

public class Dog extends Animal {
    int maxLength;
    public Dog() {
        maxLength = Math.random() > 0.5 ?  400 : 600;
    }

    @Override
    public boolean run(int distance) {
        if (distance <= maxLength) {
            System.out.println(true + " Собака пробежала");
            return true;
        }
        System.out.println(false + " Собака не может пробежать такое расстояние");
        return false;
    }

    @Override
    public boolean jump(int height) {
        if (height <= 1) {
            System.out.println(true + " Собака прыгнула ");
            return true;
        }
        System.out.println(false + " Собака не может прыгнуть так высоко ");
        return false;
    }

    @Override
    public boolean swim(int distance) {
        if (distance <= 10) {
            System.out.println(true + " Собака проплыла ");
            return true;
        }
        System.out.println(false + " Собака не может проплыть такое расстояние ");
        return false;
    }
}
