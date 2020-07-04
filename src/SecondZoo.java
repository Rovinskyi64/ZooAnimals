import java.util.ArrayList;
import java.util.List;

public class SecondZoo {

    List<Animal> Zoo1 = new ArrayList<>();
    public void fillZoo(){
        Zoo1.add(new Lizard());
        Zoo1.add(new Python());}

    public void cleanZoo(){
        Zoo1.removeAll(Zoo1);
    }

    public void showInfo(){
        for(int i=0; i<Zoo1.size(); i++){
            System.out.println(Zoo1.get(i));}
    }

    public void addAnimals(Animal a){
        Zoo1.add(a);
    }
}
