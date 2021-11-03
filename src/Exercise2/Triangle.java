package Exercise2;

public class Triangle extends Figure {
    public Triangle(double height, double length) {
        super(height, length);
    }

//Overrider method to match the formula to get area of triangle
    @Override
    public double getArea() {
        System.out.println("\nThis is the area of your triangle:");
        return (this.height * this.length) * 0.5;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
