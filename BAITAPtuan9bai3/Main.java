public class Main{
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println("ban dau: " + circle);
        System.out.println("chu vi: " + circle.getPerimeter());
        System.out.println("dien tich: " + circle.getArea());

        ResizableCircle resizableCircle = new ResizableCircle(10);
        System.out.println("\ntruoc khi thay doi: " +resizableCircle);
        resizableCircle.resize(50);
        System.out.println("sau khi giam 50%: " + resizableCircle);
        System.out.println("chu vi: " + resizableCircle.getPerimeter());
        System.out.println("dien tich: " + resizableCircle.getArea());
    }
}
