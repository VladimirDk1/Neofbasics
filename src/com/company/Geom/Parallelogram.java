package com.company.Geom;

public class Parallelogram implements GeometricShapes{

    String typeP = "Параллелограмм";
    double lengtha = 0.0;
    double lengthb = 0.0;
    double lengthh = 0.0;

    public Parallelogram(double lengtha, double lengthb, double lengthh) {
        this.lengtha = lengtha;
        this.lengthb = lengthb;
        this.lengthh = lengthh;
    }

    @Override
    public String shapeType() {
        return typeP;
    }

    @Override
    public Double square() {
        return lengtha * lengthh;
    }

    @Override
    public Double lengthLines() {
        return (lengtha + lengthb) * 2;
    }
}
