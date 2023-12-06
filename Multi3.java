
class Demo extends Thread
{
   public void run()    // Running state
   {
    String name=Thread.currentThread().getName();
       System.out.println("Current Thread is : "+Thread.currentThread().getName());
       for(int i=1;i<1000;i++)
       {
         System.out.println("Name of thread is : "+name+" with counter :"+i);
       }
   }
}

class Multi3
{
    public static void main(String arg[])
    {
        System.out.println("Current Thread is : "+Thread.currentThread().getName());

        Demo obj1=new Demo();   // new state
        Demo obj2=new Demo();   // new state

         obj1.setName("first_Thread ");
         
         obj2.setName("Second_Thread ");

        obj1.start();  // Runnable state
       obj2.start();
}
}