package sd;

import k7.p8;
public final class b {
    public static final b f47251a;
    public static final b f47252b;
    public static final b f47253c;
    public static final b d;
    public static final b f47254e;
    public static final b[] f47255f;

    static {
        ?? r02 = new Enum("CPU_ACQUIRED", 0);
        f47251a = r02;
        ?? r12 = new Enum("BLOCKING", 1);
        f47252b = r12;
        ?? r32 = new Enum("PARKING", 2);
        f47253c = r32;
        ?? r52 = new Enum("DORMANT", 3);
        d = r52;
        ?? r72 = new Enum("TERMINATED", 4);
        f47254e = r72;
        b[] bVarArr = {r02, r12, r32, r52, r72};
        f47255f = bVarArr;
        p8.a(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f47255f.clone();
    }
}
