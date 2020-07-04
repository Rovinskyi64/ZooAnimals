public class Chicken extends Animal {
    public Chicken(String name, int age, int weight, String color) {
        super(name, age, weight, color);
    }

    public Chicken() {
        super();
        System.out.println("Chicken");

        }


    @Override
    public void makeSound() {
        super.makeSound();
            System.out.println("Ko Ko Ko man what the hell are you doing here? ;)");

    }

    @Override
    public void showTalants() {
        super.showTalants();{
            System.out.println("I can fly if you ask me softly");
        }
    }

    @Override
    public void eat() {
        super.eat();{
            System.out.println("I eat grass ;)");
        }
    }

    @Override
    public void ShowInfo1() {
        super.ShowInfo1();
    }
}
