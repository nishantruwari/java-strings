
public class RunLenghtEncoding {
    public static void main(String[] args) {
        String str = "aaaaaaabbbbb";
        int n = str.length();
        StringBuilder sb = new StringBuilder();

        // System.out.println(sb);
        for (int i = 0; i < n;) {
            sb.append(str.charAt(i));
            int count = 1;
            int j = i + 1;
            if (j < n) {
                while (str.charAt(i) == str.charAt(j)) {
                    count++;
                    j++;
                    if (j == n) {
                        break;
                    }
                }
            }
            sb.append(count);
            i = i + count;

        }
        System.out.println(sb);

    }

}
