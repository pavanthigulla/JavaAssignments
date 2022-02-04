package assignment6;
class Initialize{
    Initialize(String name){
        System.out.println(name);
    }
}
public class Reference {
    public static void main(String[]args){
        Initialize arr[]=new Initialize[2];
        //for(int i=0;i<5;i++){
        //  arr[i]=new Initialize("pavan");
        //}
        arr[0]=new Initialize("pavan");
        arr[1]=new Initialize("kumar");
    }
}