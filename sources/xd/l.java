package xd;
public abstract class l extends k {
    public static String c(String str, String str2, String newValue) {
        kotlin.jvm.internal.j.e(str, "<this>");
        kotlin.jvm.internal.j.e(newValue, "newValue");
        int g10 = d.g(0, str, str2, false);
        if (g10 < 0) {
            return str;
        }
        int length = str2.length();
        int i7 = 1;
        if (length >= 1) {
            i7 = length;
        }
        int length2 = newValue.length() + (str.length() - length);
        if (length2 >= 0) {
            StringBuilder sb2 = new StringBuilder(length2);
            int i10 = 0;
            do {
                sb2.append((CharSequence) str, i10, g10);
                sb2.append(newValue);
                i10 = g10 + length;
                if (g10 >= str.length()) {
                    break;
                }
                g10 = d.g(g10 + i7, str, str2, false);
            } while (g10 > 0);
            sb2.append((CharSequence) str, i10, str.length());
            String sb3 = sb2.toString();
            kotlin.jvm.internal.j.d(sb3, "toString(...)");
            return sb3;
        }
        throw new OutOfMemoryError();
    }

    public static boolean d(String str, String prefix) {
        kotlin.jvm.internal.j.e(str, "<this>");
        kotlin.jvm.internal.j.e(prefix, "prefix");
        return str.startsWith(prefix);
    }
}
