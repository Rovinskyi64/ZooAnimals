public class Lizard extends Animal implements InterfaceZooAnimals  {
    public Lizard(String name, int age, int weight, String color) {
        super(name, age, weight, color);
    }

    @Override
    public void makeSound() {
        super.makeSound(){
            System.out.println("Yeah, boy you are so nice, give me your phone number ;)");
        };
    }

    @Override
    public void showTalants() {
        super.showTalants(){
            System.out.println("Look what i can: !572@3#......nice?");
        }
    }

    @Override
    public void eat() {
        super.eat(){
            System.out.println("I like big tasty burger and diet cola ;)");
        }
    }



}
