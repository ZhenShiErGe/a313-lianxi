import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by yizhen on 17-3-26.
 */
public class C {
    public static void main(String[] args) {
        ForeachalbeObject<Integer> list=new ForeachalbeObject<>();
        list.add(1);
        list.add(2);
        list.add(3);

        for(Integer l:list){
            System.out.println(l+" ");
        }

        list.print();
    }
}

class ForeachalbeObject<T> implements Iterable<T>{
    private Object a[]=new Object[10];
    private int curIndex=-1;
    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int cur=0;
            @Override
            public boolean hasNext() {
                return cur<=curIndex;
            }

            @Override
            public T next() {
                return ((T) a[cur++]);
            }

            public void remove() {

            }
        };
    }

    public void add(T obj){
       a[++curIndex]=obj;
    }

    public void print(){
        System.out.println(Arrays.asList(a));
    }
}
