package exercise1_4;

public class TestMain {
    public static void main(String[] args) {
        MovablePoint point1 = new MovablePoint(1, 2, 3, 4);
        System.out.println(point1);
        MovableCircle movableCircle1 = new MovableCircle(1, 2, 3, 4, 5);
        System.out.println(movableCircle1);
        movableCircle1.moveUp();
        System.out.println(movableCircle1);
        movableCircle1.moveDown();
        System.out.println(movableCircle1);
        movableCircle1.moveLeft();
        System.out.println(movableCircle1);
        movableCircle1.moveRight();
        System.out.println(movableCircle1);


    }
}
