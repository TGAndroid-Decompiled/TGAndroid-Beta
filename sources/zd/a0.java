package zd;
public final class a0 {
    public static final a0 f60039a;
    public static final a0 f60040b;
    public static final a0[] f60041c;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f60039a = r02;
        Enum r12 = new Enum("LAZY", 1);
        ?? r32 = new Enum("ATOMIC", 2);
        f60040b = r32;
        a0[] a0VarArr = {r02, r12, r32, new Enum("UNDISPATCHED", 3)};
        f60041c = a0VarArr;
        c8.j1.a(a0VarArr);
    }

    public static a0 valueOf(String str) {
        return (a0) Enum.valueOf(a0.class, str);
    }

    public static a0[] values() {
        return (a0[]) f60041c.clone();
    }
}
