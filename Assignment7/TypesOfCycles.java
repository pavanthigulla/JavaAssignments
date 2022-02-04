package Assignment7;
class Cycle{
    public void balance(){
        System.out.println("This is a new cycle ");
    }
}
class Unicycle extends Cycle{
    public void balance(){
        System.out.println("This is a new unicycle ");
    }

}
class Bicycle extends Cycle{
    public void balance(){
        System.out.println("This is a new bicycle");
    }
}
class Tricycle extends Cycle{

}
public class TypesOfCycles
{
    public static void main(String[] args) {
        Unicycle u=new Unicycle();
        Bicycle b=new Bicycle();
        Tricycle t=new Tricycle();
        Cycle arr[]=new Cycle[3];
        Cycle c=new Tricycle();
        c.balance();
        Tricycle t2=(Tricycle)c;
        t2.balance();
        arr[0]=u;
        arr[1]=b;
        arr[2]=t;
        for(int i=0;i<3;i++){
            arr[i].balance();}
    }
}
