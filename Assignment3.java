import java.io.*;
import java.util.*;
public class Assignment3 {
    public static void main(String[] args) {
        try {
            ProcessBuilder processBuilder = new ProcessBuilder("ping", "-c", "10", "127.0.0.1");
            Process process = processBuilder.start();
            BufferedReader stdInput = new BufferedReader(new InputStreamReader(process.getInputStream()));

            String s;
            int linecount = 0;
            ArrayList<Float> times = new ArrayList<>();

            while (linecount<=10 && (s = stdInput.readLine()) != null) {
                if(linecount != 0)
                    times.add(getTimeFromInputMessage(s));
                ++linecount;
            }

            Collections.sort(times);

            float mediantime = (float) (times.get(5) + times.get(6)) / 2.0f;

            System.out.println("Median time is " + mediantime +" ms");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static float getTimeFromInputMessage(String s) {
        int i = 0;
        int spacescount = 0;
        int l;
        l=s.length();

        while(i<l && spacescount < 6) {
            if(s.charAt(i)==' ') {
                ++spacescount;
            }
            ++i;
        }

        String time = "";

        while(i<l && s.charAt(i)!=' ') {
            time=time + s.charAt(i);
            ++i;
        }

        time = time.substring(5);

        return Float.parseFloat(time);

    }
}
