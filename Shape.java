package com.learn;

public class Shape {
    void area(){System.out.println("Area of shapes");}
}


class Rectangle extends Shape{
    double length;
    double height;
   void area(){System.out.println("Area of rectangle" + length*height);}
}
class Square extends Shape {
    double side;
    void area() {System.out.println("Area of square is" + side * side);}
}
class Circle extends Shape{
    double radius;
    double pi = 3.14;
    void area(){System.out.println("Area of circle is"+pi*radius*radius);}
}

class Area{
    public static void main(String args[]){
        Rectangle r = new Rectangle();
        r. length = 2.5;
        r. height= 3.5;
        r.area();
        Square s = new Square();
        s.side = 4.0;
        s.area();
        Circle c = new Circle();
        c.radius=5.6;
        c.area();
    }
}





