package vc;

import k7.p8;
public final class a {
    public static final a f48998a;
    public static final a[] f48999b;

    static {
        ?? r02 = new Enum("COROUTINE_SUSPENDED", 0);
        f48998a = r02;
        a[] aVarArr = {r02, new Enum("UNDECIDED", 1), new Enum("RESUMED", 2)};
        f48999b = aVarArr;
        p8.a(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f48999b.clone();
    }
}
