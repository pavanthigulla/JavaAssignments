package assignment6;

//A vampire number v is a number with an even number of digits n,
// that can be factored into two numbers x and y each with n/2 digits and not both with trailing zeroes,
// where v contains precisely all the digits from x and from y, in any order.
// Write a java program to print first 100 vampire numbers
import java.util.Arrays;
public class VampireNumber {

    //  count digits of a number
    public int countDigit(int no)
    {
        String number=""+no;
        return number.length();

    }
    public boolean factors(int number)
    {
        int j=0;
        int count=countDigit(number);
//        calculating the range where two factors will come
        int start=(int)Math.pow(10,count/2-1);
        int end=(int)Math.pow(10,count/2);

//        if number has even number of digits
        if(count%2==0)
        {
            for(int i=start;i<end;i++)
            {

                if(number%i==0)
                {
                    int flag=0;
                    j=number/i;
                    if(!(j>=start && j<= end))
                        flag=1;
                    if(flag==0)
                    {
                        if(checkOccurence(number,count,i,j))
                            return true;

                    }
                }
            }
        }

        return false;
    }
    //    sort the string
    public String toString(String num)
    {
        char number[]=num.toCharArray();
        Arrays.sort(number);
        String string=new String(number);
        return string;
    }
    public boolean checkOccurence(int num,int c,int fact1,int fact2)
    {
//        21 60->2160
        int no=fact1*(int)Math.pow(10,c/2)+fact2;
        String number2=""+no;


        number2=toString(number2);
        String number=toString(""+num);

//check both the previous and number comes from the factors is same or not
        return number.equals(number2);

    }
    public static void main(String[] args) {
        VampireNumber vampireNo=new VampireNumber();

        int iterator=0,no=1;

        while(iterator<100)
        {
            if(vampireNo.factors(no))
            {
                System.out.println(no);
                iterator++;

            }
            no++;

        }
    }
}