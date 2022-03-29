package fr.dm.exercises.geometry;

public class Geometry {
    public static  void main(String args[]) {
        Circle newCircle = new Circle(20);
        Triangle newTriangle = new Triangle(6, 3,5,7);
        Quadrilateral newQuadrilateral = new Quadrilateral(2, 5);

        System.out.println("Circle perimeter is : " + newCircle.getPerimeter() + ", area is : " + newCircle.getArea());
        System.out.println("Triangle perimeter is : " + newTriangle.getPerimeter() + ", area is : " + newTriangle.getArea());
        System.out.println("Quadrilateral perimeter is : " + newQuadrilateral.getPerimeter() + ", area is : " + newQuadrilateral.getArea());
    }
}
