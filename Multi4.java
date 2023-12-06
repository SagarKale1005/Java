
class Demo extends Thread
{
   public void run()    // Running state
   {
    for(int i=1;i<1000;i++)
    {}
    System.out.println("end of thread");
}
}

class Multi4
{
    public static void main(String arg[])  throws Exception
    {
        System.out.println("Current Thread is : "+Thread.currentThread().getName());

        Demo obj1=new Demo();   // new state
        obj1.start();  // Runnable state
        obj1.join();
         System.out.println("end of main thread");
       
}
}