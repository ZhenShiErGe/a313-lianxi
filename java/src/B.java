import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by yizhen on 17-3-26.
 */
enum Face{
    ONE,TWO,THREE,FOUR,FIVE,SIX
}
public class B {
    public static void main(String[] args) {
        List<Face> faceList= Arrays.asList(Face.values());
        for(Iterator<Face> i=faceList.iterator();i.hasNext();){
            Face face=i.next();
            for(Iterator<Face> j=faceList.iterator();j.hasNext();){
                System.out.println(face+" "+j.next());
            }
        }

        for(Face i:Face.values()){
            for(Face j:Face.values()){
                System.out.println(i+" "+j);
            }
        }

        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                System.out.println(i+" "+j);
            }
        }
    }
}
