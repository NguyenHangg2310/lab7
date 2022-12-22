package exercise1_8;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        MovablePoint point1 = new MovablePoint(x1, y1, xSpeed, ySpeed);
        MovablePoint point2 = new MovablePoint(x2, y2, xSpeed, ySpeed);
        this.topLeft = point1;
        this.bottomRight = point2;
    }

    @Override
    public String toString() {
        return "MovableRectangle[" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                ']';
    }

    @Override
    public void moveUp() {
        topLeft.y -= topLeft.ySpeed;
        bottomRight.y -= bottomRight.ySpeed;
    }

    @Override
    public void moveDown() {
        topLeft.y += topLeft.ySpeed;
        bottomRight.y += bottomRight.ySpeed;
    }

    @Override
    public void moveLeft() {
        topLeft.x -= topLeft.xSpeed;
        bottomRight.x -= bottomRight.xSpeed;
    }

    @Override
    public void moveRight() {
        topLeft.x += topLeft.xSpeed;
        bottomRight.x += bottomRight.xSpeed;
    }
}
