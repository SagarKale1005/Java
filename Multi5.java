
class Demo extends Thread
{
   public void run()    // Running state
   {
    for(int i=1;i<10;i++)
    {
        try
        {
            System.out.println("value of i is :"+i);
            Thread.sleep(1000);
        }
        catch(Exception obj)
        {}
    }
}
}

class Multi5
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