package ud;
public abstract class k extends j {
    public static Integer b(String str) {
        boolean z10;
        int i3;
        int i10;
        kotlin.jvm.internal.j.e(str, "<this>");
        int length = str.length();
        if (length != 0) {
            int i11 = 0;
            char charAt = str.charAt(0);
            int i12 = -2147483647;
            if (kotlin.jvm.internal.j.f(charAt, 48) < 0) {
                i3 = 1;
                if (length != 1) {
                    if (charAt != '+') {
                        if (charAt == '-') {
                            i12 = Integer.MIN_VALUE;
                            z10 = true;
                        } else {
                            return null;
                        }
                    } else {
                        z10 = false;
                    }
                } else {
                    return null;
                }
            } else {
                z10 = false;
                i3 = 0;
            }
            int i13 = -59652323;
            while (i3 < length) {
                int digit = Character.digit((int) str.charAt(i3), 10);
                if (digit >= 0) {
                    if ((i11 < i13 && (i13 != -59652323 || i11 < (i13 = i12 / 10))) || (i10 = i11 * 10) < i12 + digit) {
                        return null;
                    }
                    i11 = i10 - digit;
                    i3++;
                } else {
                    return null;
                }
            }
            if (z10) {
                return Integer.valueOf(i11);
            }
            return Integer.valueOf(-i11);
        }
        return null;
    }
}
