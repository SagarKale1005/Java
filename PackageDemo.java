import Marvellous.Maths;
import Marvellous.Infosystems.Arithematic;

class PackageDemo
{
    public static void main(String arg[])
    {
       Maths mobj=new Maths();
       Arithematic aobj=new Arithematic();
       
       int iRet=0;
       iRet=mobj.Addition(10,11);
       System.out.println("Addition is:"+iRet);
    }
}