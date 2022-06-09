
public class RevWords {
    public static void main(String[] args) {
        String s = "a good   example";
        String z = s.trim();

        // System.out.println(tr + "ll");
        String str[] = z.split("\\s+");
        // to reverse
        int j = str.length - 1;
        int i = 0;
        while (i <= j) {
            /*
             * if (str[i] == " ") {
             * i++;
             * continue;
             * } else if (str[j] == " ") {
             * j--;
             * continue;
             * }
             */
            String a = str[i];
            str[i] = str[j];
            str[j] = a;
            i++;
            j--;
        }
        /*
         * for (String p : str)
         * System.out.print(p);
         */
        // System.out.println(str);
        String output = str[0];

        for (int t = 1; t < str.length; t++) {
            if (str[t] != " ") {
                output = output + " " + str[t];
            }
        }
        output.trim();
        System.out.println(output);

        // to print in reverese but keeep actually in order
        /*
         * for (int i = str.length - 1; i >= 0; i--) {
         * System.out.print(str[i] + " ");
         * }
         */
    }

}
