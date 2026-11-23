package pe;

import c8.h9;
public final class a {
    public static final a f55580a;
    public static final a[] f55581b;

    static {
        Enum r02 = new Enum("NONE", 0);
        Enum r12 = new Enum("ALL_JSON_OBJECTS", 1);
        ?? r32 = new Enum("POLYMORPHIC", 2);
        f55580a = r32;
        a[] aVarArr = {r02, r12, r32};
        f55581b = aVarArr;
        h9.a(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f55581b.clone();
    }
}
