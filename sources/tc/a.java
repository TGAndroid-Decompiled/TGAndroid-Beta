package tc;

import i7.i8;
public final class a {
    public static final a f48210a;
    public static final a[] f48211b;

    static {
        ?? r02 = new Enum("COROUTINE_SUSPENDED", 0);
        f48210a = r02;
        a[] aVarArr = {r02, new Enum("UNDECIDED", 1), new Enum("RESUMED", 2)};
        f48211b = aVarArr;
        i8.a(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f48211b.clone();
    }
}
