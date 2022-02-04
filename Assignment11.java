import java.io.*;
import java.util.*;
public class Assignment11 {
    public static void checkOccurence(String filename)
    {
        try {

            FileReader fileReader=new FileReader(filename);
            BufferedReader reader = new BufferedReader(fileReader);
            String line = reader.readLine();

            HashMap<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < line.length(); i++) {
                if (map.containsKey(line.charAt(i))) {
                    int v = map.get(line.charAt(i));
                    v = v + 1;
                    map.put(line.charAt(i), v);
                } else {
                    map.put(line.charAt(i), 1);
                }
            }
            for (Character character : map.keySet()) {

                System.out.println("Character: " + character);
                System.out.println("no. of occurences: " + map.get(character));

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        HashMap map=new HashMap();
        Scanner scan=new Scanner(System.in);
        String string=scan.next();
        checkOccurence(string);
    }

}