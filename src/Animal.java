public abstract class Animal implements InterfaceZooAnimals {
    public String name;
    public int age;
     public int weight;
    public String color;

    public Animal(String name, int age, int weight, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }
    public Animal(){}




    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return this.weight;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }


    @Override
    public void makeSound() {

    }

    @Override
    public void showTalants() {

    }

    @Override
    public void eat() {

    }

public void ShowInfo1(){
    System.out.println("Property: ");
    System.out.println("Name: " + this.name);
    System.out.println("Age: " + this.age);
    System.out.println("Weight: " + this.weight);
    System.out.println("Color: " + this.color);
}
}
