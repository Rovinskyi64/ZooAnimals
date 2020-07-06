package Animals;

public class Lizard extends Animal implements InterfaceZooAnimals {
    public Lizard(String name, int age, int weight, String color) {
        super(name, age, weight, color);

    }

    public Lizard() {
        super();
        System.out.println("Lizard");
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
