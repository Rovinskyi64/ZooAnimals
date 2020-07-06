package Animals;

import Zoos.FirstZoo;
import Zoos.SecondZoo;

import java.util.Scanner;

public class Abstract {
    public static void chooseZoo() {
        Scanner sc = new Scanner(System.in);
        boolean b = false;
        while (!b) {

            int sd = sc.nextInt();
            switch (sd) {
                case 1: {
                    System.out.println("This zoo contains: ");
                    FirstZoo zoo1 = new FirstZoo();
                    zoo1.fillZoo();
                    b = true;
                    break;
                }
                case 2: {
                    System.out.println("This zoo contains: ");
                    SecondZoo zoo2 = new SecondZoo();
                    zoo2.fillZoo();
                    b = true;
                    break;
                }
                default: {
                    System.out.println("Incorrect input");
                }
            }
        }
    }

    public static void chooseDo() {
        Scanner sz = new Scanner(System.in);
        boolean c = false;
        while (!c) {
            int sd = sz.nextInt();
            switch (sd) {
                case 1: {
                    System.out.println("The zoo is cleaned");
                    System.out.println("would you like to fill zoo with a new animals?");
                    System.out.println("1. Yes");
                    System.out.println("2.No");
                    yesNo();
                    c = true;
                    break;
                }
                case 2: {
                    chooseAnimals();
                    c = true;
                    break;
                }
                default: {
                    System.out.println("Incorrect input");
                }
            }
        }
    }

    public static void chooseAnimals() {
        Scanner scdd = new Scanner(System.in);
        FirstZoo zoo1 = new FirstZoo();
        System.out.println("Please choose what animal do you want to add?");
        System.out.println("1.Lizard");
        System.out.println("2.Chupakabra");
        System.out.println("3.Chicken");
        System.out.println("4.Python");
        boolean d = false;
        while (!d) {
            int sd = scdd.nextInt();
            switch (sd) {
                case 1: {
                    zoo1.addAnimals(new Lizard("Animals.Lizard Chakky", 22, 22, "SFd"));
                    System.out.println("You added Lizard");
                    zoo1.infa();
                    d = true;
                    break;
                }

                case 2: {
                    zoo1.addAnimals(new Chupakabra("Chupik", 32, 32, "34"));
                    System.out.println("You added Chupakabra");
                    zoo1.infa();
                    d = true;
                    break;
                }

                case 3: {
                    zoo1.addAnimals(new Chicken("Kurka", 32, 32, "34"));
                    System.out.println("You added Chicken");
                    zoo1.infa();
                    d = true;
                    break;
                }

                default: {
                    System.out.println("Incorrect input");
                }
            }
        }
    }


    public static void yesNo() {
        Scanner scd = new Scanner(System.in);
        FirstZoo zoo1 = new FirstZoo();
        boolean f = false;
        while (!f) {
            int sd = scd.nextInt();
            switch (sd) {
                case 1: {
                    chooseAnimals();
                    f = true;
                    break;
                }
                case 2: {
                    f = true;
                    break;
                }
                default: {
                    System.out.println("Incorrect input");
                }
            }
        }
    }
}

