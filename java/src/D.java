import java.math.BigDecimal;

/**
 * Created by yizhen on 17-3-27.
 */
public class D {
    public static void main(String[] args) {
        //使用BigDecimal获得精确值
        BigDecimal sum = new BigDecimal("1.0");
        BigDecimal price = new BigDecimal("0.1");
        for (; sum.compareTo(price) >= 0; price = price.add(new BigDecimal("0.1"))) {
            sum = sum.subtract(price);
            System.out.println(price + " ");
        }
        System.out.println("sum=" + sum);

        //使用int获得精确值
        double sum1=1.0;
        double price1=0.1;

        int sum2=(int)(sum1*100);
        int price2=(int)(price1*100);
        System.out.println(sum2+" "+price2);
        for(;sum2>=price2;price2+=10){
            sum2-=price2;
            System.out.println(price2/100.00);
        }
        System.out.println("sum="+sum2/100.00);

        //错误的用法，使用double
        for(;sum1>=price1;price1+=0.1){
            sum1-=price1;
            System.out.println(price1);
        }
        System.out.println(sum1);
    }
}
