package criacionais;

public class AbstractFactory {
    // Interface para a fábrica abstrata
interface AbstractFactory {
    ProductA createProductA();
    ProductB createProductB();
}

// Interfaces para os produtos de uma família
interface ProductA {
    void doSomething();
}

interface ProductB {
    void doAnotherThing();
}

// Implementações concretas dos produtos
class ConcreteProductA1 implements ProductA {
    @Override
    public void doSomething() {
        System.out.println("Product A1 is doing something");
    }
}

class ConcreteProductB1 implements ProductB {
    @Override
    public void doAnotherThing() {
        System.out.println("Product B1 is doing another thing");
    }
}

class ConcreteProductA2 implements ProductA {
    @Override
    public void doSomething() {
        System.out.println("Product A2 is doing something");
    }
}

class ConcreteProductB2 implements ProductB {
    @Override
    public void doAnotherThing() {
        System.out.println("Product B2 is doing another thing");
    }
}

// Implementação concreta da fábrica abstrata para criar uma família específica de produtos
class ConcreteFactory1 implements AbstractFactory {
    @Override
    public ProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB1();
    }
}

class ConcreteFactory2 implements AbstractFactory {
    @Override
    public ProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB2();
    }
}

// Cliente que usa a fábrica abstrata para criar famílias de objetos
public class Client {
    public static void main(String[] args) {
        AbstractFactory factory1 = new ConcreteFactory1();
        ProductA productA1 = factory1.createProductA();
        ProductB productB1 = factory1.createProductB();

        productA1.doSomething();
        productB1.doAnotherThing();

        AbstractFactory factory2 = new ConcreteFactory2();
        ProductA productA2 = factory2.createProductA();
        ProductB productB2 = factory2.createProductB();

        productA2.doSomething();
        productB2.doAnotherThing();
    }
}

}
