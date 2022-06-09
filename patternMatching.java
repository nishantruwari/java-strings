public class patternMatching {
    public static void main(String[] args) {
        String str = "ABCABCABDED";
        String pattern = "ABC";
        int n = str.length();
        int p = pattern.length();
        for (int i = 0; i <= (n - p); i++) {
            int j;
            for (j = 0; j < p; j++) {
                if (pattern.charAt(j) != str.charAt(i + j)) {
                    break;
                }
            }
            if (j == p) {
                System.out.println("pattern found at " + i);
            }
        }
    }

}
