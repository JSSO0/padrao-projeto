package comportamentais;
/* 
//Vamos começar definindo a interface Command:

// Command
public interface Command {
    void execute();
}
//Em seguida, implementamos algumas classes concretas que representam comandos específicos:

// ConcreteCommand
public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}

// ConcreteCommand
public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
//Criamos uma classe que possui métodos para executar os comandos. Essa classe é o invocador (Invoker):

// Invoker
public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}
//Agora, implementamos uma classe que representa o receptor (Receiver), que é a entidade que realiza a ação real:

// Receiver
public class Light {
    public void turnOn() {
        System.out.println("Light is ON");
    }

    public void turnOff() {
        System.out.println("Light is OFF");
    }
}
//Finalmente, podemos testar o padrão de comando:

public class CommandExample {
    public static void main(String[] args) {
        // Criar o invocador
        RemoteControl remote = new RemoteControl();

        // Criar o receptor
        Light light = new Light();

        // Criar comandos
        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);

        // Configurar os comandos no invocador
        remote.setCommand(lightOnCommand);

        // Pressionar o botão (executar o comando)
        remote.pressButton();

        // Mudar o comando
        remote.setCommand(lightOffCommand);

        // Pressionar o botão novamente (executar o novo comando)
        remote.pressButton();
    }
}*/