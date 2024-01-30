//creates a new object 'circle'
public class Circle {
    //private variables for the object
    private double radius;
    private String colour;
    private double area;

    //default constructor of the object
    Circle (){
        radius = 2.0;
        colour = "Green";
    }

    //parameterized constructor
    Circle (double radius, String colour){
        this.radius = radius;
        this.colour = colour;
    }

    //calculates the area using the formula: a = pi r(sqr) and returns the value
    public double calculateArea(){
        area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    //calculates the perimeter using the formula: p = 2 pi r anf returns the value
    public double getPerimeter(){
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }
}
