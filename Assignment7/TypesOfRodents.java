package Assignment7;
abstract class Rodent{
    Rodent(){
        System.out.println("I'm rodent");
    }
    abstract void bite();
    abstract void height();
}
class Mouse extends Rodent {
    Mouse(){
        System.out.println("I'm Mouse");
    }
    public void bite(){
        System.out.println("mouse is biting");
    }
    public void height(){
        System.out.println("mouse can strech to 9cm");
    }
}
class Gerbil extends Rodent {
    Gerbil(){
        System.out.println("I'm Gerbil");
    }
    public void bite(){
        System.out.println("gerbil is biting");
    }
    public void height(){
        System.out.println("gerbil can strech to 11cm");
    }
}
class Hamster extends Rodent {
    Hamster(){
        System.out.println("I'm hamster");
    }
    public void bite(){
        System.out.println("hamster is biting");
    }
    public void height(){
        System.out.println("hamster can strech to 15cm");
    }
}
public class TypesOfRodents
{
    public static void main(String[] args) {
        Rodent arr[]=new Rodent[3];
        Mouse m=new Mouse();
        Hamster h=new Hamster();
        Gerbil g=new Gerbil();
        arr[0]=m;
        arr[1]=h;
        arr[2]=g;
        for(int i=0;i<3;i++){
            arr[i].bite();
            arr[i].height();
        }

    }
}
