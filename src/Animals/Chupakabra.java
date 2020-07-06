package Animals;

public class Chupakabra extends Animal implements InterfaceZooAnimals {
    public Chupakabra(String name, int age, int weight, String color) {
        super(name, age, weight, color);
    }

    public Chupakabra() {
        super();
        System.out.println("Chupakabra");
    }


    @Override
    public void makeSound() {
        super.makeSound();


    }

    @Override
    public void showTalants() {
        super.showTalants();

    }

    @Override
    public void eat() {
        super.eat();

    }
}
