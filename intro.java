public class intro {
    public static void main(String[] args) {
        String str = "nishant";
        String str1 = "nishant";
        System.out.println(str == str1);// checks address of both variable/
        // above will return true becz str will create a memmory in string pool and
        // since nishant is already present there
        // str1 wont create new memory but would point to same address as str1
        System.out.println(str.equals(str1));
        // .equalschecks actual value
        StringBuilder sb = new StringBuilder(str1); // A mutable sequence of characters. This class provides an API
                                                    // compatible with StringBuffer, but with no guarantee of
                                                    // synchronization
        sb.reverse();
        System.out.println(sb);

    }

}
