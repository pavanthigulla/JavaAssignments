import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Assignment3 {
    public static double findMedian(ArrayList<Double>a)
    {
        Collections.sort(a);
        int n=a.size();
        if (n % 2 != 0)
            return (double) a.get(n / 2);

        return (double)(a.get((n - 1) / 2) + a.get(n / 2)) / 2.0;
    }
    public static void runSystemCommand(String command) {

        try {
            Process p = Runtime.getRuntime().exec(command);
            BufferedReader inputStream = new BufferedReader(new InputStreamReader(p.getInputStream()));

            String s = "";
            ArrayList<Double> timeTaken=new ArrayList<>();

            while ((s = inputStream.readLine()) != null) {
                System.out.println(s);
                int indexOfTime=s.indexOf("time=");
                indexOfTime+=5;
                int indexOfms=s.indexOf("ms");
                if(indexOfms>-1 && indexOfTime>-1){
                    double time=Double.parseDouble(s.substring(indexOfTime,indexOfms-1));
                    timeTaken.add(time);
                    System.out.println("Median: "+findMedian(timeTaken));
                }
            }



        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {

        String s;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the url : ");
        s =in.nextLine();
        try {
            InetAddress ip = InetAddress.getByName(new URL(s).getHost());
            //System.out.println(ip);
            String ipAddress=ip.getHostAddress();
            //System.out.println(ipAddress);
            runSystemCommand("ping " + ipAddress);
        }
        catch (MalformedURLException e) {
            System.out.println("Invalid URL");
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
