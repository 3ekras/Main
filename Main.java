abstract class Bird {
    double flySpeed;

    public Bird(double flySpeed) {
        this.flySpeed = flySpeed;
    }

    abstract void fly();
    abstract void makeSound();
}

class Eagle extends Bird {
    public Eagle(double flySpeed) {
        super(flySpeed);
    }

    @Override
    void fly() {
        System.out.println("Орёл летит со скоростью: " + super.flySpeed + " км/ч");
    }

    @Override
    void makeSound() {
        System.out.println("Орёл издает звук: крик");
    }
}

class Hawk extends Bird {
    public Hawk(double flySpeed) {
        super(flySpeed);
    }

    @Override
    void fly() {
        System.out.println("Ястреб летит со скоростью: " + super.flySpeed + " км/ч");
    }

    @Override
    void makeSound() {
        System.out.println("Ястреб издает звук: кра-а");
    }
}

public class Main {
    public static void main(String[] args) {
        Eagle eagle = new Eagle(100); // Создаем объект орла
        Hawk hawk = new Hawk(120); // Создаем объект ястреба

        eagle.fly();
        eagle.makeSound();

        hawk.fly();
        hawk.makeSound();
    }
}
