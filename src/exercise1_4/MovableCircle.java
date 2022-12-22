package exercise1_4;

import exercise1_2.GeometricObject;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius;
        MovablePoint point1 = new MovablePoint(x, y, xSpeed, ySpeed);
        this.center = point1;
    }

    @Override
    public String toString() {
        return center.toString() + "," + "radius=" + radius;
    }

    @Override
    public void moveUp() {
        center.y -= center.ySpeed;
    }

    @Override
    public void moveDown() {
        center.y += center.ySpeed;

    }

    @Override
    public void moveLeft() {
        center.x -= center.xSpeed;

    }

    @Override
    public void moveRight() {
        center.x += center.xSpeed;

    }
}
