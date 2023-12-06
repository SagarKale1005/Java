import java.util.*;
import java.util.concurrent.ExecutionException;


class ExceptionDemo1X
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("enter first number:");
        int iNo1=sobj.nextInt();

        System.out.println("enter second number:");
        int iNo2=sobj.nextInt();

        int iAns=0;
        try
        {
            System.out.println("inside try block");
        iAns=iNo1/iNo2;
        }
        catch(ArithmeticException obj)
        {
            System.out.println("inside catch block"+obj);
        }
        catch(ArrayIndexOutOfBoundsException obj)
        {
            System.out.println("Array Index Out Of Bounds Exception "+obj);
        }
        catch(Exception obj)
        {
         System.out.println("inside generic catch block"+obj);                        
        }
        finally
        {
            System.out.println("inside finally block");
        }
        System.out.println("Division is :"+iAns);


    }
}