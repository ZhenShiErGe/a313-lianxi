/**
 * Created by yizhen on 17-3-27.
 */
public class F {
    public static void main(String[] args) {
        String str="";
        long start=System.currentTimeMillis();
        for(int i=0;i<1000000;i++){
            str+="a";
        }
        long end=System.currentTimeMillis();
        System.out.println(end-start);

        StringBuilder stringBuilder=new StringBuilder();
        start=System.currentTimeMillis();
        for(int i=0;i<1000000;i++){
            stringBuilder.append("a");
        }
        end=System.currentTimeMillis();
        System.out.println(end-start);

    }
}
