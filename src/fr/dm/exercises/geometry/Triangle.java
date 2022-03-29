package fr.dm.exercises.geometry;

public class Triangle {
    private double base;
    private double height;
    private double sideA;
    private double sideB;

    public Triangle(double b, double h, double A, double B) {
        this.base = b;

        this.height = h;

        this.sideA = A;

        this.sideB = B;
    }
    public double getArea() {
        return  (height * base) / 2;
    }

    public double getPerimeter() {
        return base + sideA + sideB;
    }


}
