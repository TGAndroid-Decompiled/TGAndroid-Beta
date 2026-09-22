package zd;
public final class d0 {
    public static final d0 f48869a;
    public static final d0[] f48870b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f48869a = r02;
        d0[] d0VarArr = {r02, new Enum("LAZY", 1), new Enum("ATOMIC", 2), new Enum("UNDISPATCHED", 3)};
        f48870b = d0VarArr;
        w7.m.a(d0VarArr);
    }

    public static d0 valueOf(String str) {
        return (d0) Enum.valueOf(d0.class, str);
    }

    public static d0[] values() {
        return (d0[]) f48870b.clone();
    }
}
