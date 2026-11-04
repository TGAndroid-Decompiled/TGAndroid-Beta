package wd;

import b8.zc;
public final class a0 {
    public static final a0 f57458a;
    public static final a0 f57459b;
    public static final a0[] f57460c;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f57458a = r02;
        Enum r12 = new Enum("LAZY", 1);
        ?? r32 = new Enum("ATOMIC", 2);
        f57459b = r32;
        a0[] a0VarArr = {r02, r12, r32, new Enum("UNDISPATCHED", 3)};
        f57460c = a0VarArr;
        zc.a(a0VarArr);
    }

    public static a0 valueOf(String str) {
        return (a0) Enum.valueOf(a0.class, str);
    }

    public static a0[] values() {
        return (a0[]) f57460c.clone();
    }
}
