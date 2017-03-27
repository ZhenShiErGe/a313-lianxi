/**
 * Created by yizhen on 17-3-27.
 */
public class E {
    public static void main(String[] args) {
        int sum=0;
        long start=System.currentTimeMillis();
        for(int i=0;i<100000;i++){
            sum+=i;
        }
        System.out.println("sum="+sum);
        long end=System.currentTimeMillis();
        System.out.println("time="+(end-start));

        Integer sum1=0;
        start=System.currentTimeMillis();
        for(int i=0;i<100000;i++){
            sum1=sum1+i;
        }
        System.out.println("sum="+sum1);
        end=System.currentTimeMillis();
        System.out.println("time="+(end-start));

    }
}
