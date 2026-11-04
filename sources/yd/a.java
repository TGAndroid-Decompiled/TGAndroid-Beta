package yd;

import b8.zc;
public final class a {
    public static final a f59374a;
    public static final a f59375b;
    public static final a f59376c;
    public static final a[] d;

    static {
        ?? r02 = new Enum("SUSPEND", 0);
        f59374a = r02;
        ?? r12 = new Enum("DROP_OLDEST", 1);
        f59375b = r12;
        ?? r32 = new Enum("DROP_LATEST", 2);
        f59376c = r32;
        a[] aVarArr = {r02, r12, r32};
        d = aVarArr;
        zc.a(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) d.clone();
    }
}
