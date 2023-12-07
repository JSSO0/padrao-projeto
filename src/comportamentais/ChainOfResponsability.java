package comportamentais;
/* 
//Crie uma interface chamada Handler que define o manipulador na cadeia:

public interface Handler {
    void handleRequest(Request request);
}
//Implemente várias classes concretas que implementam a interface Handler. Cada classe decide se pode manipular a solicitação ou a passa para o próximo manipulador na cadeia:

public class ConcreteHandler1 implements Handler {
    private Handler nextHandler;

    @Override
    public void handleRequest(Request request) {
        if (request.getType().equals(RequestType.TYPE1)) {
            System.out.println("ConcreteHandler1 handling the request");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
}

public class ConcreteHandler2 implements Handler {
    private Handler nextHandler;

    @Override
    public void handleRequest(Request request) {
        if (request.getType().equals(RequestType.TYPE2)) {
            System.out.println("ConcreteHandler2 handling the request");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
//Crie uma classe Request que representa a solicitação a ser processada:

public class Request {
    private RequestType type;

    public Request(RequestType type) {
        this.type = type;
    }

    public RequestType getType() {
        return type;
    }
}

public enum RequestType {
    TYPE1, TYPE2
}
//Agora, você pode usar os manipuladores para construir uma cadeia e passar uma solicitação através dela:

public class Client {
    public static void main(String[] args) {
        // Construa a cadeia
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();

        handler1.setNextHandler(handler2);

        // Crie uma solicitação
        Request request1 = new Request(RequestType.TYPE1);
        Request request2 = new Request(RequestType.TYPE2);

        // Passe a solicitação pela cadeia
        handler1.handleRequest(request1);
        handler1.handleRequest(request2);
    }
}*/