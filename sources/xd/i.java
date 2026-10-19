package xd;

import w7.c0;
public final class i {
    public static final i[] f49771a;

    static {
        i[] iVarArr = {new Enum("PUBLIC", 0), new Enum("PROTECTED", 1), new Enum("INTERNAL", 2), new Enum("PRIVATE", 3)};
        f49771a = iVarArr;
        c0.a(iVarArr);
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f49771a.clone();
    }
}
