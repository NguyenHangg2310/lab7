package exercise1_3;

public class TestMain {
    public static void main(String[] args) {
        MovablePoint movablePoint1 = new MovablePoint(1, 2, 3, 4);
        movablePoint1.moveDown();
        System.out.println(movablePoint1);
        movablePoint1.moveUp();
        System.out.println(movablePoint1);
        movablePoint1.moveLeft();
        System.out.println(movablePoint1);
        movablePoint1.moveRight();
        System.out.println(movablePoint1);
    }
}
