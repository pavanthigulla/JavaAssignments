import java.util.*;
public class Assignment2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String input=sc.nextLine();
        HashSet<Character> obj=new HashSet<>();
        input=input.toLowerCase();
        for(int i=0;i<input.length();i++)
        {
            if(Character.isAlphabetic(input.charAt(i))){
                obj.add(input.charAt(i));
            }
        }
        if(obj.size()==26){
            System.out.println("Given string has all alphabets");
        }else{
            System.out.println("Given string doesn't have all alphabets");
        }
    }
}
