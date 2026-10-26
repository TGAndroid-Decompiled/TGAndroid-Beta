package yd;

import a8.we;
public final class i {
    public static final i[] f52523a;

    static {
        i[] iVarArr = {new Enum("PUBLIC", 0), new Enum("PROTECTED", 1), new Enum("INTERNAL", 2), new Enum("PRIVATE", 3)};
        f52523a = iVarArr;
        we.a(iVarArr);
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f52523a.clone();
    }
}
