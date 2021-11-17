package com.company.Geom;

public class Triangle implements GeometricShapes{

    String typeP = "Треугольник";
    double lengtha = 0.0;
    double lengthb = 0.0;
    double lengthc = 0.0;
    double lengthh = 0.0;

    public Triangle(double a, double b, double c, double h){
        this.lengtha = a;
        this.lengthb = b;
        this.lengthc = c;
        this.lengthh = h;
    }

    @Override
    public String shapeType() {
        return typeP;
    }

    @Override
    public Double square() {
        return (lengthc * lengthh) / 2;
    }

    @Override
    public Double lengthLines() {
        return lengtha + lengthb + lengthc;
    }
}
