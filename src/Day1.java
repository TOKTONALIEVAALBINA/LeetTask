public class Day1 {
    public static void main(String[] args) {
   /*                                    #####  1  #####
        Вам даны две строки word1 и word2. Объедините строки, добавляя буквы в чередующемся порядке,
        начиная со слова1. Если строка длиннее другой, добавьте дополнительные буквы в конец объединенной строки.
        */
        System.out.println(compound("Albina".toCharArray(), "Rustamovna".toCharArray()));

    }

    public static char[] compound(char[] a, char[] b) {
        char[] c = new char[a.length + b.length];
        int ia = 0, ib = 0;
        while (1 + ia + ib < c.length) {
            if (ia < a.length) {
                c[ia + ib] = a[ia];
                ia++;
            }
            if (ib < b.length) {
                c[ia + ib] = b[ib];
                ib++;
            }
        }
        return c;
    }

}

