package Zoos;

import Animals.Animal;
import Animals.Chicken;
import Animals.Chupakabra;

import java.util.ArrayList;
import java.util.List;

public class FirstZoo {

    List<Animal> Zoo1 = new ArrayList<>();

    public void fillZoo() {
        Zoo1.add(new Chicken());
        Zoo1.add(new Chupakabra());

    }

    public void cleanZoo() {
        Zoo1.removeAll(Zoo1);
    }


    public void addAnimals(Animal a) {
        Zoo1.add(a);


    }

    public void infa() {
        for (Animal animal : Zoo1) {
            System.out.println("Name: " + animal.name);
            System.out.println("Age: " + animal.age);
            System.out.println("Color: " + animal.color);
            System.out.println("Weight: " + animal.weight);
        }
    }

}

