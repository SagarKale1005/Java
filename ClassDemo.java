
class Marvellous
{
    public int i;
    public int j;
    
    public Marvellous()
    {
       System.out.println("inside default constructor");
       this.i=0;
       this.j=0;
    }

    public Marvellous(int a,int b)
    {
        System.out.println("inside parametrised constructor");
        this.i=a;
        this.j=b;
    }
    
    public void Fun()
    {
        System.out.println("inside Fun method");
    }


}
class ClassDemo
{
    public static void main(String Arg[])
    {
        System.out.println("inside main");

        Marvellous mobj1  = new Marvellous();    // Default constructor
        Marvellous mobj2 = new Marvellous(11,21); // parametrised constructor

        System.out.println(mobj2.i);   // 11
        System.out.println(mobj2.j);   // 21

        mobj2.Fun();
    }
}