package v7;
public abstract class r6 {
    public static boolean a(String str, String str2) {
        char c10;
        int length = str.length();
        if (str != str2) {
            if (length == str2.length()) {
                for (int i10 = 0; i10 < length; i10++) {
                    char charAt = str.charAt(i10);
                    char charAt2 = str2.charAt(i10);
                    if (charAt == charAt2 || ((c10 = (char) ((charAt | ' ') - 97)) < 26 && c10 == ((char) ((charAt2 | ' ') - 97)))) {
                    }
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public static String b(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            char charAt = str.charAt(i10);
            if (charAt >= 'A' && charAt <= 'Z') {
                char[] charArray = str.toCharArray();
                while (i10 < length) {
                    char c10 = charArray[i10];
                    if (c10 >= 'A' && c10 <= 'Z') {
                        charArray[i10] = (char) (c10 ^ ' ');
                    }
                    i10++;
                }
                return String.valueOf(charArray);
            }
            i10++;
        }
        return str;
    }

    public static String c(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            char charAt = str.charAt(i10);
            if (charAt >= 'a' && charAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i10 < length) {
                    char c10 = charArray[i10];
                    if (c10 >= 'a' && c10 <= 'z') {
                        charArray[i10] = (char) (c10 ^ ' ');
                    }
                    i10++;
                }
                return String.valueOf(charArray);
            }
            i10++;
        }
        return str;
    }
}
