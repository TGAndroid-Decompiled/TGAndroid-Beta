package pe;

import c8.j1;
public final class a {
    public static final a f53481a;
    public static final a[] f53482b;

    static {
        Enum r02 = new Enum("NONE", 0);
        Enum r12 = new Enum("ALL_JSON_OBJECTS", 1);
        ?? r32 = new Enum("POLYMORPHIC", 2);
        f53481a = r32;
        a[] aVarArr = {r02, r12, r32};
        f53482b = aVarArr;
        j1.a(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f53482b.clone();
    }
}
