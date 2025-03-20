public class Main {
    public static void main(String[] args) {
        MoveablePoint diem= new MoveablePoint(5, 5, 2, 3);
        System.out.println("truoc khi di chuyen: " +diem);
        diem.moveUp();
        diem.moveRight();
        System.out.println("sau khi di chuyen: " +diem);

        MoveableCircle tron = new MoveableCircle(new MoveablePoint(0, 0, 1, 1), 10);
        System.out.println("truoc khi di chuyen: " + tron);
        tron.moveUp();
        tron.moveLeft();
        System.out.println("sau khi di chuyen: " + tron);
    }
}

