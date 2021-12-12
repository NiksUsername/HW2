package com.company;

public class Rectangle extends Figure{
    double height;
    double width;

    @Override
    double Perimeter() {
        return 2*(height+width);
    }

    @Override
    double Area() {
        return height*width;
    }

    @Override
    public void resize(double size) {
        height = height*size;
        width = width*size;
    }

    @Override
    public void move(double x,double y) {
        this.x = x;
        this.y = y;
    }

    public Rectangle(double x, double y, double height, double width) {
        super(x, y);
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "Center(" + x +
                ", " + y +
                ") , height=" + height +
                ", width=" + width +
                '}';
    }
}
