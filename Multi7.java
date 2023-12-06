
class Demo extends Thread
{
   public void run()    // Running state
   {
    
   }
   synchronized public void Display()
   {
    // Logic 
   }
}

class Multi6
{
    public static void main(String arg[])  throws Exception
    {
        System.out.println("Current Thread is : "+Thread.currentThread().getName());

        Demo obj1=new Demo();   // new state
         Demo obj2=new Demo();
         
        obj1.start();  // Runnable state
        obj2.start();

         System.out.println("priority of obj1 is :"+obj1.getPriority());
         System.out.println("priority of obj1 is :"+obj2.getPriority());

         obj1.setPriority(8);
          obj2.setPriority(10);
       
          System.out.println("priority of obj1 is :"+obj1.getPriority());
          System.out.println("priority of obj1 is :"+obj2.getPriority());
        }
}