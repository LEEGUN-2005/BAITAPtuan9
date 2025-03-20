public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 10);
        Shape square = new Rectangle(6, 6);
        Shape triangle = new Triangle(3, 4, 5);
        Shape circle = new Circle(7);

        System.out.println(rectangle);
        System.out.println("dien tich:" + rectangle.getArea());
        System.out.println("chu vi: " + rectangle.getPerimeter());

        System.out.println(square);
        System.out.println("k phai hinh vuong" + ((Rectangle) square).isSquare());

        System.out.println(triangle);
        System.out.println("dien tich: " + triangle.getArea());
        System.out.println("chu vi:" + triangle.getPerimeter());

        System.out.println(circle);
        System.out.println("dien tich: " + circle.getArea());
        System.out.println("chu vi: "+ circle.getPerimeter());
    }
}

