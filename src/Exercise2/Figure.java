package Exercise2;
//Creating a superclass to define any figure
public class Figure {
    public double height;
    public double length;

    public Figure(double height, double length) {
        this.height = height;
        this.length = length;
    }

    public double getArea(){
        System.out.println("this is the area of your figure: ");
        return this.height * this.length;

    }

    @Override
    public String toString() {
        return "Figure: " +
                "height = " + height +
                ", length = " + length;
    }
}
