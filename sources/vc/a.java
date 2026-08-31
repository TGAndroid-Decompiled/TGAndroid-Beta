package vc;

import k7.p8;
public final class a {
    public static final a f48962a;
    public static final a[] f48963b;

    static {
        ?? r02 = new Enum("COROUTINE_SUSPENDED", 0);
        f48962a = r02;
        a[] aVarArr = {r02, new Enum("UNDECIDED", 1), new Enum("RESUMED", 2)};
        f48963b = aVarArr;
        p8.a(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f48963b.clone();
    }
}
