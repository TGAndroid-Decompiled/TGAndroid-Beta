package vd;

import v7.g7;
public final class a {
    public static final a[] f50782a;

    static {
        a[] aVarArr = {new Enum("SUSPEND", 0), new Enum("DROP_OLDEST", 1), new Enum("DROP_LATEST", 2)};
        f50782a = aVarArr;
        g7.a(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f50782a.clone();
    }
}
