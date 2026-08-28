package rc;

import g7.n7;
public final class a {
    public static final a f47127a;
    public static final a[] f47128b;

    static {
        ?? r02 = new Enum("COROUTINE_SUSPENDED", 0);
        f47127a = r02;
        a[] aVarArr = {r02, new Enum("UNDECIDED", 1), new Enum("RESUMED", 2)};
        f47128b = aVarArr;
        n7.a(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f47128b.clone();
    }
}
