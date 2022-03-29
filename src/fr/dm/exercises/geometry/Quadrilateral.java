package fr.dm.exercises.geometry;

public class Quadrilateral {
    private double height;
    private double width;


    public Quadrilateral(double h, double w) {

        this.height = h;

        this.width = w;

    }
    public double getArea() {

        return  height * width;
    }

    public double getPerimeter() {

        return 2 * (height + width);
    }
}
