import java.util.Scanner;
import java.util.regex.*;
public class Assignment9
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(Pattern.matches("^[A-Z].*[.]",str));
    }
}