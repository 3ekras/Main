abstract class Instrument {
    abstract void play();
    abstract void tune();
}

class Guitar extends Instrument {
    @Override
    void play() {
        System.out.println("Играем на гитаре");
    }

    @Override
    void tune() {
        System.out.println("Настройка гитары");
    }
}

class Piano extends Instrument {
    @Override
    void play() {
        System.out.println("Играем на пианино");
    }

    @Override
    void tune() {
        System.out.println("Настройка пианино");
    }
}

public class Maing {
    public static void main(String[] args) {
        Guitar guitar = new Guitar();
        Piano piano = new Piano();

        guitar.tune();
        guitar.play();

        piano.tune();
        piano.play();
    }
}