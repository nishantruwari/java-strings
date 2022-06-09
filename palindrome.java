public class palindrome {
    public static void main(String[] args) {
        String name = "nitin";
        /*
         * approach 1 using stringbuffer
         * StringBuffer str = new StringBuffer(name);
         * str.reverse(); // Function of String buffer
         * String str1 = str.toString();//converts to string so that we can compare
         * if (name.equals(str1)) {
         * System.out.println("Palindrome");
         * } else {
         * System.out.println("Not palindrome");
         * }
         */

        // approach 2- Two Pointer Approach
        int count = name.length();
        int i = 0;
        int j = count - 1;
        while (i < j) {
            if (name.charAt(i) != name.charAt(j)) {
                System.out.println("not palindrome ");
                return;
            }
            i++;
            j--;
        }
        System.out.println("palindrome");

    }

}
