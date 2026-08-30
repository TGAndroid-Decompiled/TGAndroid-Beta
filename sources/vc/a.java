package vc;

import k7.o8;
public final class a {
    public static final a f45663a;
    public static final a[] f45664b;

    static {
        ?? r02 = new Enum("COROUTINE_SUSPENDED", 0);
        f45663a = r02;
        a[] aVarArr = {r02, new Enum("UNDECIDED", 1), new Enum("RESUMED", 2)};
        f45664b = aVarArr;
        o8.a(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f45664b.clone();
    }
}
