package sd;

import k7.o8;
public final class b {
    public static final b f44325a;
    public static final b f44326b;
    public static final b f44327c;
    public static final b d;
    public static final b e;
    public static final b[] f44328f;

    static {
        ?? r02 = new Enum("CPU_ACQUIRED", 0);
        f44325a = r02;
        ?? r12 = new Enum("BLOCKING", 1);
        f44326b = r12;
        ?? r32 = new Enum("PARKING", 2);
        f44327c = r32;
        ?? r52 = new Enum("DORMANT", 3);
        d = r52;
        ?? r72 = new Enum("TERMINATED", 4);
        e = r72;
        b[] bVarArr = {r02, r12, r32, r52, r72};
        f44328f = bVarArr;
        o8.a(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f44328f.clone();
    }
}
