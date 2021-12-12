package com.company;

public abstract class Figure implements Moveable {
    protected double x;
    protected double y;

    abstract double Perimeter();
    abstract double Area();

    public Figure(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Figure() {}
}
