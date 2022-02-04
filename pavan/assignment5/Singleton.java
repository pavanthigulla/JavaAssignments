package pavan.assignment5;

public class Singleton {
    String str;
    public static Object show(String s)
    {
        //str=s;
        Singleton obj=new Singleton();
        return obj;
    }
    public void display()
    {
        System.out.println(str);
    }


}
