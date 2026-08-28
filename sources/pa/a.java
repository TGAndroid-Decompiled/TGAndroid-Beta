package pa;

import j$.util.DesugarTimeZone;
import java.util.TimeZone;
public abstract class a {
    public static final TimeZone f45507a = DesugarTimeZone.getTimeZone("UTC");

    public static boolean a(String str, int i9, char c10) {
        if (i9 < str.length() && str.charAt(i9) == c10) {
            return true;
        }
        return false;
    }

    public static java.util.Date b(java.lang.String r17, java.text.ParsePosition r18) {
        throw new UnsupportedOperationException("Method not decompiled: pa.a.b(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    public static int c(int i9, int i10, String str) {
        int i11;
        int i12;
        if (i9 >= 0 && i10 <= str.length() && i9 <= i10) {
            if (i9 < i10) {
                i12 = i9 + 1;
                int digit = Character.digit(str.charAt(i9), 10);
                if (digit >= 0) {
                    i11 = -digit;
                } else {
                    throw new NumberFormatException("Invalid number: " + str.substring(i9, i10));
                }
            } else {
                i11 = 0;
                i12 = i9;
            }
            while (i12 < i10) {
                int i13 = i12 + 1;
                int digit2 = Character.digit(str.charAt(i12), 10);
                if (digit2 >= 0) {
                    i11 = (i11 * 10) - digit2;
                    i12 = i13;
                } else {
                    throw new NumberFormatException("Invalid number: " + str.substring(i9, i10));
                }
            }
            return -i11;
        }
        throw new NumberFormatException(str);
    }
}
