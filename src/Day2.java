public class Day2 {
    public static void main(String[] args) {
        /*              ####### 2 ######

        Для двух строк s и t мы говорим «t делит s» тогда и только тогда, когда s = t + ... + t
        (т. е. t объединяется само с собой один или несколько раз).
        Учитывая две строки str1 и str2, верните наибольшую строку x, такую, что x делит обе строки: str1 и str2.
         */
        System.out.println(method2("java","java"));
    }
    public static String method2 (String str1, String str2){
        if (!(str1 + str2).equals(str2 + str1)) {
            return "no identical lines";
        }
        int len = words(str1.length(), str2.length());
        return str1.substring(0, len);
    }

    private static int words(int a, int b) {
        return b == 0 ? a :words(b, a % b);
    }
}
