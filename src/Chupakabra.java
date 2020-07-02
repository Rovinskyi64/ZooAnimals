public class Chupakabra extends Animal implements InterfaceZooAnimals{
    public Chupakabra(String name, int age, int weight, String color) {
        super(name, age, weight, color);
    }

    @Override
    public void makeSound() {
        super.makeSound(){
            System.out.println("Hello boy do you know who I am? ;)");
        };
    }

    @Override
    public void showTalants() {
        super.showTalants(){
            System.out.println("I can drink your blood through 2 small holes in your neck");
        }
    }

    @Override
    public void eat() {
        super.eat(){
            System.out.println("Your tasty blood ;)");
        }
    }
}
