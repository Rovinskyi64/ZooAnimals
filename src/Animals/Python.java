package Animals;

public class Python extends Animal implements InterfaceZooAnimals {
    public Python(String name, int age, int weight, String color) {
        super(name, age, weight, color);
    }

    public Python() {
        super();
        System.out.println("Python");
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("ShShShSh....bleat ;)");

    }

    @Override
    public void showTalants() {
        super.showTalants();
        {
            System.out.println("Come to me i`ll hug you so :)");
        }
    }

    @Override
    public void eat() {
        super.eat();
        {
            System.out.println("I like big mouse and whiskey ;)");
        }
    }
}
