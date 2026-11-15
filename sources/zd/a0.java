package zd;
public final class a0 {
    public static final a0 f61247a;
    public static final a0 f61248b;
    public static final a0[] f61249c;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f61247a = r02;
        Enum r12 = new Enum("LAZY", 1);
        ?? r32 = new Enum("ATOMIC", 2);
        f61248b = r32;
        a0[] a0VarArr = {r02, r12, r32, new Enum("UNDISPATCHED", 3)};
        f61249c = a0VarArr;
        c8.l1.a(a0VarArr);
    }

    public static a0 valueOf(String str) {
        return (a0) Enum.valueOf(a0.class, str);
    }

    public static a0[] values() {
        return (a0[]) f61249c.clone();
    }
}
