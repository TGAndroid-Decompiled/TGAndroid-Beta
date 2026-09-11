package v7;
public abstract class t6 {
    public static String a(int i10, int i11, String str) {
        if (i10 < 0) {
            return u6.a("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return u6.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(i2.g.i(i11, "negative size: "));
    }

    public static void b(long j3, String str, boolean z10) {
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(u6.a(str, Long.valueOf(j3)));
    }

    public static void c(int i10, int i11) {
        String a2;
        if (i10 >= 0 && i10 < i11) {
            return;
        }
        if (i10 >= 0) {
            if (i11 >= 0) {
                a2 = u6.a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
            } else {
                throw new IllegalArgumentException(i2.g.i(i11, "negative size: "));
            }
        } else {
            a2 = u6.a("%s (%s) must not be negative", "index", Integer.valueOf(i10));
        }
        throw new IndexOutOfBoundsException(a2);
    }

    public static void d(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException(str);
    }

    public static void e(int i10, int i11) {
        if (i10 >= 0 && i10 <= i11) {
            return;
        }
        throw new IndexOutOfBoundsException(a(i10, i11, "index"));
    }

    public static void f(int i10, int i11, int i12) {
        String a2;
        if (i10 >= 0 && i11 >= i10 && i11 <= i12) {
            return;
        }
        if (i10 >= 0 && i10 <= i12) {
            if (i11 >= 0 && i11 <= i12) {
                a2 = u6.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
            } else {
                a2 = a(i11, i12, "end index");
            }
        } else {
            a2 = a(i10, i12, "start index");
        }
        throw new IndexOutOfBoundsException(a2);
    }
}
