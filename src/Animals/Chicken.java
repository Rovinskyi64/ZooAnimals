package Animals;

import Animals.Animal;

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
        super.showTalants();

    }

    @Override
    public void eat() {
        super.eat();

    }

    @Override
    public void ShowInfo1() {
        super.ShowInfo1();
    }
}
