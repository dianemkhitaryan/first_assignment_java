package fr.dm.exercises.geometry;

public class Circle {

    private static final double PI = 3.14159;
    private double radius;

    public Circle(double r) {
        this.radius = r;
    }

    public double getArea() {

        return PI * radius * radius;
    }

        public double getPerimeter() {
            return 2 * PI * radius;
        }

    }
