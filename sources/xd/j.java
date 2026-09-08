package xd;

import com.google.android.gms.internal.vision.e2;
public abstract class j extends i {
    public static boolean b(String str, String str2) {
        kotlin.jvm.internal.i.e(str, "<this>");
        if (d(0, str, str2, false) < 0) {
            return false;
        }
        return true;
    }

    public static final int c(CharSequence charSequence) {
        kotlin.jvm.internal.i.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int d(int i10, CharSequence charSequence, String string, boolean z10) {
        char upperCase;
        char upperCase2;
        boolean z11;
        String str;
        boolean z12;
        boolean regionMatches;
        kotlin.jvm.internal.i.e(charSequence, "<this>");
        kotlin.jvm.internal.i.e(string, "string");
        if (!z10 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(string, i10);
        }
        int length = charSequence.length();
        if (i10 < 0) {
            i10 = 0;
        }
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        ud.d dVar = new ud.d(i10, length, 1);
        boolean z13 = charSequence instanceof String;
        int i11 = dVar.f47049c;
        int i12 = dVar.f47048b;
        if (z13 && e2.u(string)) {
            if ((i11 > 0 && i10 <= i12) || (i11 < 0 && i12 <= i10)) {
                int i13 = i10;
                while (true) {
                    String str2 = (String) charSequence;
                    int length3 = string.length();
                    if (!z10) {
                        regionMatches = string.regionMatches(0, str2, i13, length3);
                        str = string;
                        z12 = z10;
                    } else {
                        str = string;
                        z12 = z10;
                        regionMatches = str.regionMatches(z12, 0, str2, i13, length3);
                    }
                    if (regionMatches) {
                        return i13;
                    }
                    if (i13 != i12) {
                        i13 += i11;
                        string = str;
                        z10 = z12;
                    } else {
                        return -1;
                    }
                }
            } else {
                return -1;
            }
        } else if ((i11 <= 0 || i10 > i12) && (i11 >= 0 || i12 > i10)) {
            return -1;
        } else {
            while (true) {
                int length4 = string.length();
                if (i10 >= 0 && string.length() - length4 >= 0 && i10 <= charSequence.length() - length4) {
                    for (int i14 = 0; i14 < length4; i14++) {
                        char charAt = string.charAt(i14);
                        char charAt2 = charSequence.charAt(i10 + i14);
                        if (charAt == charAt2 || (z10 && ((upperCase = Character.toUpperCase(charAt)) == (upperCase2 = Character.toUpperCase(charAt2)) || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)))) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                        }
                    }
                    return i10;
                }
                if (i10 != i12) {
                    i10 += i11;
                } else {
                    return -1;
                }
            }
        }
    }

    public static boolean e(String str) {
        kotlin.jvm.internal.i.e(str, "<this>");
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (!Character.isWhitespace(charAt) && !Character.isSpaceChar(charAt)) {
                return false;
            }
        }
        return true;
    }

    public static String f(int i10, String str) {
        CharSequence charSequence;
        kotlin.jvm.internal.i.e(str, "<this>");
        if (i10 >= 0) {
            if (i10 <= str.length()) {
                charSequence = str.subSequence(0, str.length());
            } else {
                StringBuilder sb2 = new StringBuilder(i10);
                sb2.append((CharSequence) str);
                int length = i10 - str.length();
                int i11 = 1;
                if (1 <= length) {
                    while (true) {
                        sb2.append(' ');
                        if (i11 == length) {
                            break;
                        }
                        i11++;
                    }
                }
                charSequence = sb2;
            }
            return charSequence.toString();
        }
        throw new IllegalArgumentException(i2.g.j(i10, "Desired length ", " is less than zero."));
    }

    public static String g(String str, String str2, String newValue) {
        kotlin.jvm.internal.i.e(str, "<this>");
        kotlin.jvm.internal.i.e(newValue, "newValue");
        int d = d(0, str, str2, false);
        if (d < 0) {
            return str;
        }
        int length = str2.length();
        int i10 = 1;
        if (length >= 1) {
            i10 = length;
        }
        int length2 = newValue.length() + (str.length() - length);
        if (length2 >= 0) {
            StringBuilder sb2 = new StringBuilder(length2);
            int i11 = 0;
            do {
                sb2.append((CharSequence) str, i11, d);
                sb2.append(newValue);
                i11 = d + length;
                if (d >= str.length()) {
                    break;
                }
                d = d(d + i10, str, str2, false);
            } while (d > 0);
            sb2.append((CharSequence) str, i11, str.length());
            String sb3 = sb2.toString();
            kotlin.jvm.internal.i.d(sb3, "toString(...)");
            return sb3;
        }
        throw new OutOfMemoryError();
    }

    public static boolean h(String str, String prefix) {
        kotlin.jvm.internal.i.e(str, "<this>");
        kotlin.jvm.internal.i.e(prefix, "prefix");
        return str.startsWith(prefix);
    }

    public static String i(String str, String delimiter, String str2) {
        kotlin.jvm.internal.i.e(delimiter, "delimiter");
        int d = d(0, str, delimiter, false);
        if (d == -1) {
            return str2;
        }
        String substring = str.substring(delimiter.length() + d, str.length());
        kotlin.jvm.internal.i.d(substring, "substring(...)");
        return substring;
    }

    public static String j(String str, String str2) {
        int lastIndexOf = str.lastIndexOf(46, c(str));
        if (lastIndexOf == -1) {
            return str2;
        }
        String substring = str.substring(lastIndexOf + 1, str.length());
        kotlin.jvm.internal.i.d(substring, "substring(...)");
        return substring;
    }
}
