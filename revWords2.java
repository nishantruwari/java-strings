
//import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class revWords2 {
    public static void main(String[] args) {
        String s = "hello how are u";
        String words[] = s.split("//s+");
        /*
         * List<String> list = Arrays.asList(words);
         * Collections.reverse(list);
         * System.out.println(String.join(" ", list));
         */
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]).append(" ");
        }
        // return sb.toString().trim();
        System.out.println(sb.toString().trim());

    }

}
