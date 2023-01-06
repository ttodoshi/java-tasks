package OOP.Lesson2Task0;

public class Vector {
    private final double x;
    private final double y;
    private final double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static Vector[] randomVectors(int n) {
        Vector[] vectors = new Vector[n];
        for (int i = 0; i < n; i++) {
            vectors[i] = new Vector(Math.random(), Math.random(), Math.random());
        }
        return vectors;
    }

    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public double scalarProduct(Vector vector) {
        return this.x * vector.x + this.y * vector.y + this.z + vector.z;
    }

    public Vector vectorProduct(Vector vector) {
        return new Vector(this.y * vector.z - this.z * vector.y, this.z * vector.x - this.x * vector.z, this.x * vector.y - this.y * vector.x);
    }

    public double cos(Vector vector) {
        return this.scalarProduct(vector) / (this.length() * vector.length());
    }

    public Vector add(Vector vector) {
        return new Vector(this.x + vector.x, this.y + vector.y, this.z + vector.z);
    }

    public Vector subtract(Vector vector) {
        return new Vector(this.x - vector.x, this.y - vector.y, this.z - vector.z);
    }
}
