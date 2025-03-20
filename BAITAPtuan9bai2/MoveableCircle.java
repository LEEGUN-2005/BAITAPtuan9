public class MoveableCircle implements Moveable {
    private int radius;
    private MoveablePoint center;

    public MoveableCircle(MoveablePoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }
    @Override
    public void moveUp() {
        center.moveUp();
    }
    @Override
    public void moveDown() {
        center.moveDown();
    }
    @Override
    public void moveLeft() {
        center.moveLeft();
    }
    @Override
    public void moveRight() {
        center.moveRight();
    }
    @Override
    public String toString() {
        return "hinh tron co the di chuyen{ban kinh=" + radius + ",tam=" + center + "}";
    }
}
