import static Animals.Abstract.chooseDo;
import static Animals.Abstract.chooseZoo;


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


}
