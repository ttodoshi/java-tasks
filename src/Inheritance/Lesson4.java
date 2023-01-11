package Inheritance;

public class Lesson4 {
    public static void main(String[] args) {
        Box box = new Box(50);
        System.out.println(box.add(new Cylinder(2, 3)));
        System.out.println(box.add(new Pyramid(5, 5)));
        System.out.println(box.add(new Pyramid(5, 5)));
    }
}

interface Shape {
    double getVolume();
}

abstract class SolidOfRevolution implements Shape {
    protected double radius;

    public SolidOfRevolution(double radius) {
        this.radius = radius;
    }
}

class Cylinder extends SolidOfRevolution {
    private final double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    @Override
    public double getVolume() {
        return Math.PI * radius * radius * height;
    }

    public double getHeight() {
        return height;
    }
}

class Ball extends SolidOfRevolution {
    public Ball(double radius) {
        super(radius);
    }

    @Override
    public double getVolume() {
        return Math.PI * Math.pow(radius, 3) * 4 / 3;
    }
}

class Pyramid implements Shape {
    private final double s;
    private final double height;

    public Pyramid(double s, double height) {
        this.s = s;
        this.height = height;
    }

    @Override
    public double getVolume() {
        return s * height * 1 / 3;
    }

    public double getS() {
        return s;
    }

    public double getHeight() {
        return height;
    }
}

class Box implements Shape {
    private double volume;
    private double remainingVolume;

    public Box(double volume) {
        this.volume = volume;
        this.remainingVolume = volume;
    }

    public boolean add(Shape shape) {
        if (this.remainingVolume - shape.getVolume() > 0) {
            this.remainingVolume -= shape.getVolume();
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double getVolume() {
        return volume;
    }

    public double getRemainingVolume() {
        return remainingVolume;
    }
}