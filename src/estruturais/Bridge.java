package estruturais;
/* 
// Implementação da cor
//Primeiro, crie a interface Color que representa a implementação das cores:

public interface Color {
    void applyColor();
}
//Em seguida, implemente algumas classes que representam cores concretas, por exemplo, RedColor e GreenColor:
public class RedColor implements Color {
    @Override
    public void applyColor() {
        System.out.println("Applying red color");
    }
}

public class GreenColor implements Color {
    @Override
    public void applyColor() {
        System.out.println("Applying green color");
    }
}

//Agora, crie a interface Shape que representa a abstração das formas:
// Abstração da forma
public abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract void applyColor();
}

//Implemente algumas classes que representam formas concretas, por exemplo, Circle e Square:
public class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        System.out.print("Circle filled with ");
        color.applyColor();
    }
}

public class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        System.out.print("Square filled with ");
        color.applyColor();
    }
}

//Agora, você pode usar as classes de forma junto com as classes de cor de forma flexível. Por exemplo:
public class Client {
    public static void main(String[] args) {
        Color redColor = new RedColor();
        Color greenColor = new GreenColor();

        Shape redCircle = new Circle(redColor);
        Shape greenSquare = new Square(greenColor);

        redCircle.applyColor();    // Output: Circle filled with Applying red color
        greenSquare.applyColor();  // Output: Square filled with Applying green color
    }
}*/