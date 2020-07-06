package Zoos;

import Animals.Animal;
import Animals.Lizard;
import Animals.Python;

import java.util.ArrayList;
import java.util.List;

public class SecondZoo {

    List<Animal> Zoo2 = new ArrayList<>();

    public void fillZoo() {
        Zoo2.add(new Lizard());
        Zoo2.add(new Python());
    }

    public void cleanZoo() {
        Zoo2.removeAll(Zoo2);
    }


    public void addAnimals(Animal a) {
        Zoo2.add(a);
    }

    public void infa() {
        for (Animal animal : Zoo2) {
            System.out.println("Name: " + animal.name);
            System.out.println("Age: " + animal.age);
            System.out.println("Color: " + animal.color);
            System.out.println("Weight: " + animal.weight);
        }
    }
}