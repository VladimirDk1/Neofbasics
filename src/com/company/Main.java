package com.company;

import com.company.Geom.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Номера");
        UserNumber userNumber = new UserNumber();
        userNumber.addNewUser("Владимир");
        userNumber.addNewUser("Виктория");
        userNumber.addNewUser("Алексей");


        userNumber.addNumUser("Владимир", "12345");
        userNumber.addNumUser("Владимир", "12345");
        userNumber.addNumUser("Владимир", "123456");
        userNumber.addNumUser("Алексей", "32465");
        userNumber.addNumUser("Виктория", "9876543");

        userNumber.getNum("и");


        System.out.println("\nГ. фигуры");
        ArrayList<GeometricShapes> g = new ArrayList<>();
        g.add(new Point());
        g.add(new Circle(3));
        g.add(new Parallelogram(4, 5, 3));
        g.add(new Rectangle(3, 5));
        g.add(new Square(4));
        g.add(new StraigthLine(6));
        g.add(new Triangle(3, 4, 6, 5));

        for (GeometricShapes str: g
             ) {
            System.out.println("Тип фигуры: " + str.shapeType() + "; Длина линий: " + str.lengthLines() + "; Площадь: " + str.square());
        }

        System.out.println("\nПеречисления");
        System.out.println(Color.RED.getCode());
        System.out.println(Color.GREEN.getCode());
    }
}
