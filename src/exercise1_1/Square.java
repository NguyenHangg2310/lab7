package exercise1_1;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(double side) {
        setWidth(side);
        setLength(side);
    }

    public Square(double side, String color, boolean filled) {
        setWidth(side);
        setLength(side);
        setColor(color);
        setFilled(filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        length = side;
        width = side;
    }

    public void setWidth(double side) {
       setSide(side);
    }

    public void setLength(double side) {
        setSide(side);
    }

    @Override
    public String toString() {
        return "Square[" + super.toString() +
                "width=" + width +
                ", length=" + length +
                ']';
    }
}
