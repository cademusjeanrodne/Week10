package week10;

public class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle() {
        this.side1 = 1;
        this.side2 = 1;
        this.side3 = 1;
    }

    public double getArea()
    {
        double s = (this.side1 + this.side2 + this.side3) / 2;
        double area = Math.sqrt(s * (s-this.side1) * (s-this.side2) * (s-this.side3));
        return area;
    }

    public String toString() {
        return "Triangle: side1 = "+this.side1+", side2 = "+this.side2+", side 3 = "+this.side3+"\n"+super.toString();
    }
}
