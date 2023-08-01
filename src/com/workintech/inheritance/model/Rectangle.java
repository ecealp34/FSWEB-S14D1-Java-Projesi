package com.workintech.inheritance.model;

public class Rectangle {

    private double width;
    private double length;

    private void checkWidth(double width) {
        if(width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }
    public Rectangle(double width, double length) {
        checkWidth(width);
        this.length = length < 0 ? 0 : length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }
    public double getArea() {
        return width * length;
    }
}
