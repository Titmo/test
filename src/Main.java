import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String[] str = {"aa", "bb", "cc", "aa"};
        String string="";
        Set<String> set = new HashSet<String>(Arrays.asList(str));
        String[] result = set.toArray(new String[0]);
        for (int i = 0; i < result.length; i++) {
            string= string + result[i]+" ";
        }
        System.out.println(string);
    }

}