import java.util.ArrayList;
import java.util.List;

public class FirstZoo  {

        List<Animal> Zoo1 = new ArrayList<>();
       public void fillZoo(){
           Zoo1.add(new Chicken());
           Zoo1.add(new Chupakabra());

    }

    public void cleanZoo(){
           Zoo1.removeAll(Zoo1);
    }


    public void addAnimals(Animal a){
           Zoo1.add(a);



    }
    public void infa(){
          for(int i=0; i<Zoo1.size(); i++){
              System.out.println("Name: "+Zoo1.get(i).name);
              System.out.println("Age: "+Zoo1.get(i).age);
              System.out.println("Color: "+Zoo1.get(i).color);
              System.out.println("Weight: "+Zoo1.get(i).weight);
          }
    }

   }

