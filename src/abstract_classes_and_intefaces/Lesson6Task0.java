package abstract_classes_and_intefaces;

public class Lesson6Task0 {
    public static void main(String[] args) {
        System.out.println(new CelsiusConverter().convert(22.5));
        System.out.println(new KelvinsConverter().convert(22.5));
        System.out.println(new FahrenheitConverter().convert(22.5));
    }
}

abstract class BaseConverter {
    protected abstract double convert(double celsius);
}

class CelsiusConverter extends BaseConverter {

    @Override
    protected double convert(double celsius) {
        return celsius;
    }
}

class KelvinsConverter extends BaseConverter {

    @Override
    protected double convert(double celsius) {
        return celsius + 273.15;
    }
}

class FahrenheitConverter extends BaseConverter {

    @Override
    protected double convert(double celsius) {
        return celsius * 9 / 5 + 32;
    }
}