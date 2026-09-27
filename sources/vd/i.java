package vd;

import w7.n;
public final class i {
    public static final i[] f44617a;

    static {
        i[] iVarArr = {new Enum("PUBLIC", 0), new Enum("PROTECTED", 1), new Enum("INTERNAL", 2), new Enum("PRIVATE", 3)};
        f44617a = iVarArr;
        n.a(iVarArr);
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f44617a.clone();
    }
}
