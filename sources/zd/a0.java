package zd;

import c8.h9;
public final class a0 {
    public static final a0 f61941a;
    public static final a0 f61942b;
    public static final a0[] f61943c;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f61941a = r02;
        Enum r12 = new Enum("LAZY", 1);
        ?? r32 = new Enum("ATOMIC", 2);
        f61942b = r32;
        a0[] a0VarArr = {r02, r12, r32, new Enum("UNDISPATCHED", 3)};
        f61943c = a0VarArr;
        h9.a(a0VarArr);
    }

    public static a0 valueOf(String str) {
        return (a0) Enum.valueOf(a0.class, str);
    }

    public static a0[] values() {
        return (a0[]) f61943c.clone();
    }
}
