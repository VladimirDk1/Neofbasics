package com.company.Geom;

public class Point implements GeometricShapes{

    String typeP = "Точка";
    final double lengthP = 0.0;

    @Override
    public String shapeType() {
        return typeP;
    }

    @Override
    public Double square() {
        return lengthP;
    }

    @Override
    public Double lengthLines() {
        return lengthP;
    }
}
