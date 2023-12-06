
class Base
{
   public void fun()
   {
    System.out.println("inside base fun");
   }
   public void gun()
   {
    System.out.println("inside base gun");
   }
   public void sun()
   {
    System.out.println("inside base sun");
   }
   public void run()
   {
    System.out.println("inside base run");
   }

}

class Derived extends Base
{
   public void fun()
   {
    System.out.println("inside derived fun");
   }
   public void sun()
   {
    System.out.println("inside derived sun");
   }
   public void run(int A)
   {
    System.out.println("inside derived run with one parameter ");
   }
   public void mun()
   {
    System.out.println("inside derived mun");
   }

}

class Overriding
{
    public static void main(String arg[])
    {
        Base bobj=new Derived();  // upcasting

        bobj.fun();
        bobj.gun();
        bobj.sun();
        bobj.run();
       // bobj.run(11);
       //bobj.mun();

    }
}