package javaBasics.javaBasics;

public class triangleClassAreaPerimeter {
    private double side1;
    private double side2;
    private double sideBase;
    private double height;
    triangleClassAreaPerimeter()
    {
        this(0.0, 0.0,0.0,0.0); //constructor chaining
    }
    public triangleClassAreaPerimeter(double side1, double side2, double sideBase, double height) {
        this.side1 = side1;
        this.side2 = side2;
        this.sideBase = sideBase;
        this.height = height;
    }
    public triangleClassAreaPerimeter(double side) {
        this.side1 = side;
        this.side2 = side;
        this.sideBase = side;
        this.height = Math.sqrt((side*side) - ((side/2)*(side/2)));
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSideBase() {
        return sideBase;
    }

    public void setSideBase(double sideBase) {
        this.sideBase = sideBase;
    }

    public double getArea(){
        double area = (this.sideBase * this.height)/2;
        return area;
    }
    public double getPerimeter(){
        double perimeter = this.side1+ this.side2 + this.sideBase;
        return perimeter;

    }
}
