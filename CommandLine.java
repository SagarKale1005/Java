
class CommandLine
{
    public static void main(String arg[])
    {
        System.out.println("number of command line arguments are :"+arg.length);
 
       System.out.println("command line arguments:");

       for(int i=0;i<arg.length;i++)
       {
        System.out.println(arg[i]);
       }
    }
}