package qd;

import i7.i8;
public final class b {
    public static final b f46611a;
    public static final b f46612b;
    public static final b f46613c;
    public static final b d;
    public static final b f46614e;
    public static final b[] f46615f;

    static {
        ?? r02 = new Enum("CPU_ACQUIRED", 0);
        f46611a = r02;
        ?? r12 = new Enum("BLOCKING", 1);
        f46612b = r12;
        ?? r32 = new Enum("PARKING", 2);
        f46613c = r32;
        ?? r52 = new Enum("DORMANT", 3);
        d = r52;
        ?? r72 = new Enum("TERMINATED", 4);
        f46614e = r72;
        b[] bVarArr = {r02, r12, r32, r52, r72};
        f46615f = bVarArr;
        i8.a(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f46615f.clone();
    }
}
