package ud;

import k2.p1;
import x7.e5;
public abstract class d extends l {
    public static boolean e(String str, String str2) {
        kotlin.jvm.internal.j.e(str, "<this>");
        if (i(0, 2, str, str2) < 0) {
            return false;
        }
        return true;
    }

    public static final int f(CharSequence charSequence) {
        kotlin.jvm.internal.j.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int g(int i3, CharSequence other, String string, boolean z10) {
        String str;
        boolean z11;
        boolean regionMatches;
        kotlin.jvm.internal.j.e(other, "<this>");
        kotlin.jvm.internal.j.e(string, "string");
        if (!z10 && (other instanceof String)) {
            return ((String) other).indexOf(string, i3);
        }
        int length = other.length();
        if (i3 < 0) {
            i3 = 0;
        }
        int length2 = other.length();
        if (length > length2) {
            length = length2;
        }
        rd.d dVar = new rd.d(i3, length, 1);
        boolean z12 = other instanceof String;
        int i10 = dVar.f54499c;
        int i11 = dVar.f54498b;
        int i12 = dVar.f54497a;
        if (z12 && (string instanceof String)) {
            if ((i10 <= 0 || i12 > i11) && (i10 >= 0 || i11 > i12)) {
                return -1;
            }
            int i13 = i12;
            while (true) {
                String other2 = (String) other;
                int length3 = string.length();
                kotlin.jvm.internal.j.e(string, "<this>");
                kotlin.jvm.internal.j.e(other2, "other");
                if (!z10) {
                    regionMatches = string.regionMatches(0, other2, i13, length3);
                    str = string;
                    z11 = z10;
                } else {
                    str = string;
                    z11 = z10;
                    regionMatches = str.regionMatches(z11, 0, other2, i13, length3);
                }
                if (regionMatches) {
                    return i13;
                }
                if (i13 == i11) {
                    return -1;
                }
                i13 += i10;
                string = str;
                z10 = z11;
            }
        } else if ((i10 <= 0 || i12 > i11) && (i10 >= 0 || i11 > i12)) {
            return -1;
        } else {
            while (true) {
                int length4 = string.length();
                kotlin.jvm.internal.j.e(other, "other");
                if (i12 >= 0 && string.length() - length4 >= 0 && i12 <= other.length() - length4) {
                    for (int i14 = 0; i14 < length4; i14++) {
                        if (e5.a(string.charAt(i14), other.charAt(i12 + i14), z10)) {
                        }
                    }
                    return i12;
                }
                if (i12 == i11) {
                    return -1;
                }
                i12 += i10;
            }
        }
    }

    public static int h(char c2, int i3, int i10, CharSequence charSequence) {
        if ((i10 & 2) != 0) {
            i3 = 0;
        }
        kotlin.jvm.internal.j.e(charSequence, "<this>");
        if (!(charSequence instanceof String)) {
            char[] cArr = {c2};
            if (charSequence instanceof String) {
                return ((String) charSequence).indexOf(cArr[0], i3);
            }
            if (i3 < 0) {
                i3 = 0;
            }
            int f10 = f(charSequence);
            if (i3 <= f10) {
                while (!e5.a(cArr[0], charSequence.charAt(i3), false)) {
                    if (i3 != f10) {
                        i3++;
                    } else {
                        return -1;
                    }
                }
                return i3;
            }
            return -1;
        }
        return ((String) charSequence).indexOf(c2, i3);
    }

    public static int i(int i3, int i10, CharSequence charSequence, String str) {
        if ((i10 & 2) != 0) {
            i3 = 0;
        }
        return g(i3, charSequence, str, false);
    }

    public static boolean j(String str) {
        kotlin.jvm.internal.j.e(str, "<this>");
        for (int i3 = 0; i3 < str.length(); i3++) {
            char charAt = str.charAt(i3);
            if (!Character.isWhitespace(charAt) && !Character.isSpaceChar(charAt)) {
                return false;
            }
        }
        return true;
    }

    public static String k(int i3, String str) {
        CharSequence charSequence;
        kotlin.jvm.internal.j.e(str, "<this>");
        if (i3 >= 0) {
            if (i3 <= str.length()) {
                charSequence = str.subSequence(0, str.length());
            } else {
                StringBuilder sb2 = new StringBuilder(i3);
                sb2.append((CharSequence) str);
                int length = i3 - str.length();
                int i10 = 1;
                if (1 <= length) {
                    while (true) {
                        sb2.append(' ');
                        if (i10 == length) {
                            break;
                        }
                        i10++;
                    }
                }
                charSequence = sb2;
            }
            return charSequence.toString();
        }
        throw new IllegalArgumentException(p1.j(i3, "Desired length ", " is less than zero."));
    }

    public static String l(String str, String delimiter, String str2) {
        kotlin.jvm.internal.j.e(delimiter, "delimiter");
        int i3 = i(0, 6, str, delimiter);
        if (i3 == -1) {
            return str2;
        }
        String substring = str.substring(delimiter.length() + i3, str.length());
        kotlin.jvm.internal.j.d(substring, "substring(...)");
        return substring;
    }

    public static String m(String str, String str2) {
        int lastIndexOf = str.lastIndexOf(46, f(str));
        if (lastIndexOf == -1) {
            return str2;
        }
        String substring = str.substring(lastIndexOf + 1, str.length());
        kotlin.jvm.internal.j.d(substring, "substring(...)");
        return substring;
    }
}
