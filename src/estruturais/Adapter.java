//Suponha que você tenha uma interface existente chamada OldInterface:
/*public interface OldInterface {
    void doSomethingOld();
}*/
//E você tem uma nova classe chamada NewClass com uma interface diferente chamada NewInterface:
/*public interface NewInterface {
    void doSomethingNew();
}

public class NewClass implements NewInterface {
    @Override
    public void doSomethingNew() {
        System.out.println("Doing something new");
    }
}*/

//Agora, você deseja utilizar NewClass em um contexto que espera a interface OldInterface. Para isso, você pode criar um adaptador chamado Adapter que implementa a OldInterface e utiliza NewClass internamente:
/*public class Adapter implements OldInterface {
    private NewInterface newInterface;

    public Adapter(NewInterface newInterface) {
        this.newInterface = newInterface;
    }

    @Override
    public void doSomethingOld() {
        // Adaptando a chamada para a nova interface
        newInterface.doSomethingNew();
    }
}*/

//Agora você pode usar o Adapter para permitir que objetos que esperam OldInterface interajam com NewClass:
/* 
public class Client {
    public static void main(String[] args) {
        // Usando a nova classe por meio do adaptador
        NewClass newClass = new NewClass();
        OldInterface adapter = new Adapter(newClass);

        // Chamando o método antigo, que internamente chama o método novo
        adapter.doSomethingOld();
    }
}*/