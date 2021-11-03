package Exercise2;
//Creating a subclass to inherit attributes
public class Rectangle extends Figure {

    public Rectangle(double height, double length) {
        super(height, length);
    }

//Overrider method to match the formula to get area of rectangle
    @Override
    public double getArea() {
        System.out.println("\nThis is the area of your rectangle:");
        return this.height * this.length;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
