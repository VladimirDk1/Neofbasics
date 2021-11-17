package com.company.Geom;

public class Rectangle implements GeometricShapes{

    String typeP = "Квадрат";
    double lengtha = 0.0;
    double lengthb = 0.0;

    public Rectangle(double lengtha, double lengthb) {
        this.lengtha = lengtha;
        this.lengthb = lengthb;
    }

    @Override
    public String shapeType() {
        return typeP;
    }

    @Override
    public Double square() {
        return lengtha * lengthb;
    }

    @Override
    public Double lengthLines() {
        return (lengtha + lengthb) * 2;
    }
}
