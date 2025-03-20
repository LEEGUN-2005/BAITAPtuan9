public class MoveablePoint implements Moveable {
    private int x, y;
    private int xSpeed,ySpeed;

    public MoveablePoint(int x,int y,int xSpeed,int ySpeed) {
        this.x=x;
        this.y=y;
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    @Override
    public void moveUp() {
        y += ySpeed;
    }
    @Override
    public void moveDown() {
        y -= ySpeed;
    }
    @Override
    public void moveLeft() {
        x -= xSpeed;
    }
    @Override
    public void moveRight() {
        x += xSpeed;
    }
    @Override
    public String toString() {
        return "diem co the di chuyen{x=" + x + ", y="+y + ", xSpeed=" +xSpeed + ", ySpeed=" +ySpeed + "}";
    }
}
