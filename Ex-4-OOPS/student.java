import java.util.Scanner;
public class student {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int s1m1,s1m2,s1m3,s2m1,s2m2,s2m3,s2m4;
        System.out.println("Enter the 3 Marks of student A-->:");
        s1m1=s.nextInt();
        s1m2=s.nextInt();
        s1m3=s.nextInt();
        A amark=new A(s1m1,s1m2,s1m3);
        System.out.println(amark.getPercentage());
        System.out.println("Enter the 4 Marks of student B-->:");
        s2m1=s.nextInt();
        s2m2=s.nextInt();
        s2m3=s.nextInt();
        s2m4=s.nextInt();
        B bmark=new B(s2m1,s2m2,s2m3,s2m4);
        System.out.println(bmark.getPercentage());
    }
}
abstract class Marks
{
    abstract float getPercentage();
}

class A extends Marks
{
    int Mark1,Mark2,Mark3;
    A(int m1,int m2,int m3)
    {
     Mark1=m1;
     Mark2=m2;
     Mark3=m3;
    }
    float getPercentage()
    {
        int tot=(Mark1+Mark2+Mark3);
        float avg=tot/3;
        return avg;
    }
}
class B extends Marks
{
    int Mark1,Mark2,Mark3,Mark4;
    B(int p,int q,int r,int s)
    {
     Mark1=p;
     Mark2=q;
     Mark3=r;
     Mark4=s;
    }
    float getPercentage()
    {
        int tot=(Mark1+Mark2+Mark3+Mark4);
        float avg=tot/4;
        return avg;
    }
}