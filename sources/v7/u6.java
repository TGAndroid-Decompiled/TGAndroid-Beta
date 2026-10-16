package v7;
public abstract class u6 {
    public static String a(int i10, int i11, String str) {
        if (i10 < 0) {
            return v6.a("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return v6.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(i2.d.j(i11, "negative size: "));
    }

    public static void b(int i10, String str, boolean z10) {
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(v6.a(str, Integer.valueOf(i10)));
    }

    public static void c(long j10, String str, boolean z10) {
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(v6.a(str, Long.valueOf(j10)));
    }

    public static void d(String str, int i10, int i11, boolean z10) {
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(v6.a(str, Integer.valueOf(i10), Integer.valueOf(i11)));
    }

    public static void e(String str, long j10, long j11, boolean z10) {
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(v6.a(str, Long.valueOf(j10), Long.valueOf(j11)));
    }

    public static void f(String str, boolean z10) {
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(String.valueOf(str));
    }

    public static void g(boolean z10) {
        if (z10) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void h(boolean z10, String str, Object obj) {
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(v6.a(str, obj));
    }

    public static void i(boolean z10, String str, Object obj, Comparable comparable) {
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(v6.a(str, obj, comparable));
    }

    public static void j(int i10, int i11) {
        String a2;
        if (i10 >= 0 && i10 < i11) {
            return;
        }
        if (i10 >= 0) {
            if (i11 >= 0) {
                a2 = v6.a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
            } else {
                throw new IllegalArgumentException(i2.d.j(i11, "negative size: "));
            }
        } else {
            a2 = v6.a("%s (%s) must not be negative", "index", Integer.valueOf(i10));
        }
        throw new IndexOutOfBoundsException(a2);
    }

    public static void k(i2.x0 x0Var) {
        x0Var.getClass();
    }

    public static void l(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException(str);
    }

    public static void m(int i10, int i11) {
        if (i10 >= 0 && i10 <= i11) {
            return;
        }
        throw new IndexOutOfBoundsException(a(i10, i11, "index"));
    }

    public static void n(int i10, int i11, int i12) {
        String a2;
        if (i10 >= 0 && i11 >= i10 && i11 <= i12) {
            return;
        }
        if (i10 >= 0 && i10 <= i12) {
            if (i11 >= 0 && i11 <= i12) {
                a2 = v6.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
            } else {
                a2 = a(i11, i12, "end index");
            }
        } else {
            a2 = a(i10, i12, "start index");
        }
        throw new IndexOutOfBoundsException(a2);
    }

    public static void o(String str, boolean z10) {
        if (z10) {
            return;
        }
        throw new IllegalStateException(String.valueOf(str));
    }

    public static void p(boolean z10) {
        if (z10) {
            return;
        }
        throw new IllegalStateException();
    }
}
