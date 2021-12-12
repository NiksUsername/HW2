package com.company;

public class Circle extends Figure {
    double radius;

    @Override
    double Perimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    double Area() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public void resize(double size) {
        radius = radius*size;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", Center(" + x +
                ", " + y +
                ")}";
    }

    @Override
    public void move(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }
}
