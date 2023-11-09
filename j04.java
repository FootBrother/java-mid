class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return 3.14159 * radius * radius;
    }

    public String toString() {
        String str = "半徑=" + radius;
        return str;
    }
}

class Square {
    double length;
    double width;

    Square(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }

    public String toString() {
        String str = ("長=" + length + " 寬=" + width);
        return str;
    }
}

class Calculator {
    double price; // 每平方公尺的價格（元）

    Calculator(double price) {
        this.price = price;
    }

    double calculatePrice(Circle c) {
        return c.area() * price;
    }

    double calculatePrice(Square s) {
        return s.area() * price;
    }
}

public class j04 {
    public static void main(String[] args) {
        Circle c = new Circle(5.1);
        Square s = new Square(5.1, 7.2);
        Calculator ca = new Calculator(3000);
        System.out.println(c.toString());
        System.out.println("圓形面積價格" + ca.calculatePrice(c));
        System.out.println(s.toString());
        System.out.println("矩形面積價格" + ca.calculatePrice(s));
    }
}