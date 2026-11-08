package xd;

import c8.rd;
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

    public static final int g(int i7, CharSequence other, String string, boolean z9) {
        String str;
        boolean z10;
        boolean regionMatches;
        kotlin.jvm.internal.j.e(other, "<this>");
        kotlin.jvm.internal.j.e(string, "string");
        if (!z9 && (other instanceof String)) {
            return ((String) other).indexOf(string, i7);
        }
        int length = other.length();
        if (i7 < 0) {
            i7 = 0;
        }
        int length2 = other.length();
        if (length > length2) {
            length = length2;
        }
        ud.d dVar = new ud.d(i7, length, 1);
        boolean z11 = other instanceof String;
        int i10 = dVar.f56521c;
        int i11 = dVar.f56520b;
        int i12 = dVar.f56519a;
        if (z11 && (string instanceof String)) {
            if ((i10 <= 0 || i12 > i11) && (i10 >= 0 || i11 > i12)) {
                return -1;
            }
            int i13 = i12;
            while (true) {
                String other2 = (String) other;
                int length3 = string.length();
                kotlin.jvm.internal.j.e(string, "<this>");
                kotlin.jvm.internal.j.e(other2, "other");
                if (!z9) {
                    regionMatches = string.regionMatches(0, other2, i13, length3);
                    str = string;
                    z10 = z9;
                } else {
                    str = string;
                    z10 = z9;
                    regionMatches = str.regionMatches(z10, 0, other2, i13, length3);
                }
                if (regionMatches) {
                    return i13;
                }
                if (i13 == i11) {
                    return -1;
                }
                i13 += i10;
                string = str;
                z9 = z10;
            }
        } else if ((i10 <= 0 || i12 > i11) && (i10 >= 0 || i11 > i12)) {
            return -1;
        } else {
            while (true) {
                int length4 = string.length();
                kotlin.jvm.internal.j.e(other, "other");
                if (i12 >= 0 && string.length() - length4 >= 0 && i12 <= other.length() - length4) {
                    for (int i14 = 0; i14 < length4; i14++) {
                        if (rd.a(string.charAt(i14), other.charAt(i12 + i14), z9)) {
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

    public static int h(char c10, int i7, int i10, CharSequence charSequence) {
        if ((i10 & 2) != 0) {
            i7 = 0;
        }
        kotlin.jvm.internal.j.e(charSequence, "<this>");
        if (!(charSequence instanceof String)) {
            char[] cArr = {c10};
            if (charSequence instanceof String) {
                return ((String) charSequence).indexOf(cArr[0], i7);
            }
            if (i7 < 0) {
                i7 = 0;
            }
            int f10 = f(charSequence);
            if (i7 <= f10) {
                while (!rd.a(cArr[0], charSequence.charAt(i7), false)) {
                    if (i7 != f10) {
                        i7++;
                    } else {
                        return -1;
                    }
                }
                return i7;
            }
            return -1;
        }
        return ((String) charSequence).indexOf(c10, i7);
    }

    public static int i(int i7, int i10, CharSequence charSequence, String str) {
        if ((i10 & 2) != 0) {
            i7 = 0;
        }
        return g(i7, charSequence, str, false);
    }

    public static boolean j(String str) {
        kotlin.jvm.internal.j.e(str, "<this>");
        for (int i7 = 0; i7 < str.length(); i7++) {
            char charAt = str.charAt(i7);
            if (!Character.isWhitespace(charAt) && !Character.isSpaceChar(charAt)) {
                return false;
            }
        }
        return true;
    }

    public static String k(int i7, String str) {
        CharSequence charSequence;
        kotlin.jvm.internal.j.e(str, "<this>");
        if (i7 >= 0) {
            if (i7 <= str.length()) {
                charSequence = str.subSequence(0, str.length());
            } else {
                StringBuilder sb2 = new StringBuilder(i7);
                sb2.append((CharSequence) str);
                int length = i7 - str.length();
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
        throw new IllegalArgumentException(jg.g.k(i7, "Desired length ", " is less than zero."));
    }

    public static String l(String str, String delimiter, String str2) {
        kotlin.jvm.internal.j.e(delimiter, "delimiter");
        int i7 = i(0, 6, str, delimiter);
        if (i7 == -1) {
            return str2;
        }
        String substring = str.substring(delimiter.length() + i7, str.length());
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
