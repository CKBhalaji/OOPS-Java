package ex.pkg1;

import java.util.Scanner;

public class Electric {
    public static void main(String[] args) {
        
        consumer obj=new consumer();
        obj.getdata();
    }
}
class consumer
{
    String name;
    int num;
    int pr;
    int cr;
    String type;
    double bill;
    void getdata()
    {
    
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the details");
        System.out.println("Enter the consumer number");
        num=obj.nextInt();
        System.out.println("Enter name");
        name=obj.next();
        System.out.println("Enter previous month reading");
        pr=obj.nextInt();
        System.out.println("Enter current month reading");
        cr=obj.nextInt();
        System.out.println("Enter type if 'C' is consumer or 'd' is domestic");
        type=obj.next();
        if(type.equals("c")||type.equals("C"))
        {
            cbill o=new cbill(cr);
        }
        else if(type.equals("d")||type.equals("D"))
        {
            dbill p=new dbill(cr);
        }
    
    }
}   
class dbill
{
    dbill(double cr)
    {
        double bill;
        
        if(cr<=100)
        {
            bill=(1.50*cr);
        }   
        else if(cr>100&&cr<=200)
        {
        
           bill=(100*1.50)+((cr-100)*3);
        }
        else if(cr>200&&cr<=500)
        {
        
            bill=(100*1.50)+(100*3)+((cr-200)*4.50);
        }
        else 
        {
        
            bill=(100*1.50)+(100*3)+(300*4.50)+((cr-500)*7);
        }
        System.out.println("Amount="+bill); 
    }
}
        
class cbill
{
    cbill(double cr)
    {
        double bill;
        
        if(cr<=100)
        {
            bill=2.50*cr;
        }   
        else if(cr>100&&cr<=200)
        {
        
           bill=(100*2.50)+((cr-100)*5); 
        }
        else if(cr>200&&cr<=500)
        {
        
            bill=(100*2.50)+(100*5)+((cr-200)*6.50);
        }
        else 
        {        
            bill=(100*2.50)+(100*5)+(300*6.50)+((cr-500)*9);
        }
        System.out.println("Amount="+bill);
  }
}
