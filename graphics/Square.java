package graphics;

public class Square extends Rectangle {
    // A square is just a rectangle where length == width
    public Square(double side) {
        super(side, side);
    }
}