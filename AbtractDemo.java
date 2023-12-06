

abstract class Demo 
{

    public int A;
    public int B;

    public Demo()
    {
        System.out.println("inside Demo Constructor");
        this.A=0;
        this.B=0;
    }
    abstract void fun();     // virtual void fun()=0; (c++)

    void gun()
    {
        System.out.println("inside gun");
    }
}

class Hello extends Demo
{
    public Hello()
    {
        System.out.println("inside Hello Constructor");
    }

    public void fun()
    {
        System.out.println("inside fun or Hello");
    }
    }


class AbtractDemo
{
public static void main (String arg[])
{
   // Demo obj = new Demo(); Error.
    Hello hobj = new Hello();
    hobj.fun();
    hobj.gun();
}
}
