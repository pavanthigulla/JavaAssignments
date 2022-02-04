class a{
    public void m(){
        try{
            int a=8/0;
            int b[]=new int[3];
            String str=null;
            System.out.println(b[4]);
            System.out.println(a);
            System.out.println(str.length());
        }
        catch(NullPointerException e){
            System.out.println(e);
        }
        catch(ArithmeticException e){
            System.out.println(e);
       }

        finally{
            System.out.println("Finally block is always executed");
        }
    }

}
public class Assignment8
{
    public static void main(String[] args) {
        a obj=new a();
        obj.m();
    }}