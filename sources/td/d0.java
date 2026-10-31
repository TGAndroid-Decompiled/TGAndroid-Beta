package td;

import v7.g7;
public final class d0 {
    public static final d0 f48607a;
    public static final d0[] f48608b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f48607a = r02;
        d0[] d0VarArr = {r02, new Enum("LAZY", 1), new Enum("ATOMIC", 2), new Enum("UNDISPATCHED", 3)};
        f48608b = d0VarArr;
        g7.a(d0VarArr);
    }

    public static d0 valueOf(String str) {
        return (d0) Enum.valueOf(d0.class, str);
    }

    public static d0[] values() {
        return (d0[]) f48608b.clone();
    }
}
