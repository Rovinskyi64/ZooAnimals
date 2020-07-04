import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println("Hello this is a Zoo land, please choose what do you want to see: ");
        System.out.println("1. Watch the first Zoo");
        System.out.println("2. Watch the second Zoo");

        chooseZoo();

        System.out.println("Please choose what do you want to do with Zoo? ");
        System.out.println("1. Clean Zoo");
        System.out.println("2. Add new animals at zoo");

        chooseDo();


    }

    public static void chooseZoo() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int sd = sc.nextInt();
            if (sd < 1 || sd > 2) {
                System.out.println("Incorrect input");
            } else if (sd == 1) {
                System.out.println("This zoo contains: ");
                FirstZoo zoo1 = new FirstZoo();
                zoo1.fillZoo();
                break;
            } else if (sd == 2) {
                System.out.println("This zoo contains: ");
                SecondZoo zoo2 = new SecondZoo();
                zoo2.fillZoo();
                break;
            }
        }
    }

    public static void chooseDo() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int sd = sc.nextInt();
            if (sd < 1 || sd > 2) {
                System.out.println("Incorrect input");
            } else if (sd == 1) {
                System.out.println("The zoo is cleaned");
                System.out.println("would you like to fill zoo with a new animals?");
                System.out.println("1. Yes");
                System.out.println("2.No");
                yesNo();break;

            } else if (sd == 2) {

                chooseAnimals();break;
            }
        }
    }

    public static void chooseAnimals() {
        Scanner sc = new Scanner(System.in);
        FirstZoo zoo1 = new FirstZoo();
        System.out.println("Please choose what animal do you want to add?");
        System.out.println("1.Lizard");
        System.out.println("2.Chupakabra");
        System.out.println("3.Chicken");
        System.out.println("4.Python");
        while (true) {
            int sd = sc.nextInt();
              if (sd == 1) {
                zoo1.addAnimals(new Lizard("Lizard Chakky", 22, 22, "SFd"));
                System.out.println("You added Lizard");
                zoo1.infa();
                break;
            } else if (sd == 2) {
                zoo1.addAnimals(new Chupakabra("Chupik", 32, 32, "34"));
                System.out.println("You added Chupakabra");
                zoo1.infa();
                break;
            } else if (sd == 3) {
                zoo1.addAnimals(new Chicken("Kurka", 32, 32, "34"));
                System.out.println("You added Chicken");
                zoo1.infa();
                break;
            } else if (sd == 4) {
                zoo1.addAnimals(new Python("Питон", 32, 32, "34"));
                System.out.println("You added Python");
                zoo1.infa();
                break;
            }
              else {
                  System.out.println("Incorrect input");}


        }

    }

    public static void yesNo() {
        Scanner sc = new Scanner(System.in);
        FirstZoo zoo1 = new FirstZoo();
        while (true) {
            int sd = sc.nextInt();
            if (sd < 1 || sd > 2) {
                System.out.println("Incorrect input");
            }
            else if(sd==1){chooseAnimals();break;}
            else if(sd==2){break;}
        }
    }
}
