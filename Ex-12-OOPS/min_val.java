/*2. Write a java program to find the minimum value from the given
type of elements using a generic function.*/
import java.util.*;
public class min_val
{
    public static void main(String[] args) 
    {
        Integer num[]={45,25,90,78,36};
        mini m=new mini();
        m.min(num);                                                                                                       
    }
}
class mini
{
    < T extends Comparable<T>> void min(T[]y)
    {
        T min;
        min=y[0];
        for(int i=1;i<y.length;i++ )
        {
            if(min.compareTo(y[i])>0)
            {
                min=y[i];
            }
        }
        System.out.println("Minimum Element in the given List-->:"+min);
    }
}