package v7;
public abstract class t5 {
    public static void a(int i10, int i11) {
        String a2;
        if (i10 >= 0 && i10 < i11) {
            return;
        }
        if (i10 >= 0) {
            if (i11 < 0) {
                throw new IllegalArgumentException(i2.g.i(i11, "negative size: "));
            }
            a2 = u5.a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
        } else {
            a2 = u5.a("%s (%s) must not be negative", "index", Integer.valueOf(i10));
        }
        throw new IndexOutOfBoundsException(a2);
    }

    public static void b(int i10, int i11) {
        if (i10 >= 0 && i10 <= i11) {
            return;
        }
        throw new IndexOutOfBoundsException(d(i10, i11, "index"));
    }

    public static void c(int i10, int i11, int i12) {
        String d;
        if (i10 >= 0 && i11 >= i10 && i11 <= i12) {
            return;
        }
        if (i10 >= 0 && i10 <= i12) {
            if (i11 >= 0 && i11 <= i12) {
                d = u5.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
            } else {
                d = d(i11, i12, "end index");
            }
        } else {
            d = d(i10, i12, "start index");
        }
        throw new IndexOutOfBoundsException(d);
    }

    public static String d(int i10, int i11, String str) {
        if (i10 < 0) {
            return u5.a("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return u5.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(i2.g.i(i11, "negative size: "));
    }
}
