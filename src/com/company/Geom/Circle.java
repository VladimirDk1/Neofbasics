package com.company.Geom;

public class Circle implements GeometricShapes{

    String typeP = "Окружность";
    double lengthR = 0.0;

    public Circle(double l){
        this.lengthR = l;
    }

    @Override
    public String shapeType() {
        return typeP;
    }

    @Override
    public Double square() {
        return 3.14 * Math.sqrt(lengthR);
    }

    @Override
    public Double lengthLines() {
        return lengthR;
    }
}
