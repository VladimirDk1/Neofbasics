package com.company.Geom;

public class Square implements GeometricShapes{

    String typeP = "Квадрат";
    double lengtha = 0.0;

    public Square(double lengtha) {
        this.lengtha = lengtha;
    }

    @Override
    public String shapeType() {
        return typeP;
    }

    @Override
    public Double square() {
        return Math.sqrt(lengtha);
    }

    @Override
    public Double lengthLines() {
        return 4 * lengtha;
    }
}
