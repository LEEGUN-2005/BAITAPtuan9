public class Triangle extends Shape {
    private double side1, side2, side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
    @Override
    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    @Override
    public String toString() {
        return "hinh tam giac:canh 1=" + side1 + ",canh 2=" + side2 + ",canh 3=" + side3 ;
    }
}

