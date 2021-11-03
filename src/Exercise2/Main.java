package Exercise2;

import java.util.ArrayList;

public class Main {
    //Creating objects with different figures and measurements
    public static void main(String[] args) {
        Figure triangle = new Triangle(10.5, 10.5);
        Figure rectangle = new Rectangle(10.5, 10.5);

        ArrayList<Figure> figures = new ArrayList<Figure>();
        figures.add(triangle);
        figures.add(rectangle);

        //Printing the different objects
        for (Figure figure : figures ) {
            System.out.println(figure);
        }

        //Calling the method to get area of the different figures
        System.out.println(triangle.getArea());
        System.out.println(rectangle.getArea());

    }
}
