package exercise1_5;

public class TestMain {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5.5);
        System.out.println(circle1);
        System.out.println(circle1.getArea());
        System.out.println(circle1.getPerimeter());

        Resizable resizable1 = new ResizableCircle(5.5);
        System.out.println(resizable1);
        resizable1.resize(20);
        System.out.println(resizable1);
    }
}
