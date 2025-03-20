public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public void setSize(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public double getArea() {
        return width * height;
    }
    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
    public boolean isSquare() {
        return width == height;
    }
    @Override
    public String toString() {
        return "hinh chu nhat:rong=" + width + ",dai=" + height ;
    }
}
