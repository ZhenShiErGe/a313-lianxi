import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class A{
    public static void main(String[] args) {

        List<String> listA=new ArrayList<>();
        List<String> listB=new ArrayList<>();

        //bad codding
        Iterator<String > iteratorA=listA.iterator();
        while(iteratorA.hasNext()){
            System.out.println(iteratorA.next());
        }
        Iterator<String> iteratorB=listB.iterator();
        while(iteratorA.hasNext()){
            System.out.println(iteratorB.next());
        }

        //good codding
        for(Iterator<String> iterator=listA.iterator();iterator.hasNext();){
            System.out.println(iterator.next());
        }
        for(Iterator<String> iterator=listB.iterator();iterator.hasNext();){
            System.out.println(iterator.next());
        }
    }
}