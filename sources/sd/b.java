package sd;

import k7.p8;
public final class b {
    public static final b f47282a;
    public static final b f47283b;
    public static final b f47284c;
    public static final b d;
    public static final b f47285e;
    public static final b[] f47286f;

    static {
        ?? r02 = new Enum("CPU_ACQUIRED", 0);
        f47282a = r02;
        ?? r12 = new Enum("BLOCKING", 1);
        f47283b = r12;
        ?? r32 = new Enum("PARKING", 2);
        f47284c = r32;
        ?? r52 = new Enum("DORMANT", 3);
        d = r52;
        ?? r72 = new Enum("TERMINATED", 4);
        f47285e = r72;
        b[] bVarArr = {r02, r12, r32, r52, r72};
        f47286f = bVarArr;
        p8.a(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f47286f.clone();
    }
}
