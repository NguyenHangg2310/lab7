package exercise1_8;

public class TestRectangle {
    public static void main(String[] args) {

        Movable movable1 = new MovableRectangle(1,2,3,4,10,15);
        System.out.println(movable1);
        movable1.moveUp();
        System.out.println(movable1);
        movable1.moveDown();
        System.out.println(movable1);
        movable1.moveLeft();
        System.out.println(movable1);
        movable1.moveRight();
        System.out.println(movable1);
    }
}
