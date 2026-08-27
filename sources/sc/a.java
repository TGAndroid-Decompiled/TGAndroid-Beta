package sc;

import h7.s7;

public final class a {

    public static final a f47847a;

    public static final a[] f47848b;

    static {
        a aVar = new a("COROUTINE_SUSPENDED", 0);
        f47847a = aVar;
        a[] aVarArr = {aVar, new a("UNDECIDED", 1), new a("RESUMED", 2)};
        f47848b = aVarArr;
        s7.a(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f47848b.clone();
    }
}
