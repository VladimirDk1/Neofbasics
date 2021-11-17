package com.company.Geom;

public class StraigthLine implements GeometricShapes{

    String typeP = "Прямая линия";
    double lengthP = 0.0;

    public StraigthLine(double l){
        this.lengthP = l;
    }

    @Override
    public String shapeType() {
        return typeP;
    }

    @Override
    public Double square() {
        return this.lengthP;
    }

    @Override
    public Double lengthLines() {
        return this.lengthP;
    }
}
