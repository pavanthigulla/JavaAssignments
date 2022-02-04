package assignment6;
class construct{
    construct(int a)
    {
        this(a*2,a*3);
        System.out.println(a);
    }
    construct (int b,int c){
        System.out.println(b);
        System.out.println(c);
    }

}

public class OverLoaded {
    public static void main(String[] args)
    {
        construct obj=new construct(10);
    }

}