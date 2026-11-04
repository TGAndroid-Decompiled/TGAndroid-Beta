package sd;

import b8.zc;
public final class i {
    public static final i[] f54706a;

    static {
        i[] iVarArr = {new Enum("PUBLIC", 0), new Enum("PROTECTED", 1), new Enum("INTERNAL", 2), new Enum("PRIVATE", 3)};
        f54706a = iVarArr;
        zc.a(iVarArr);
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f54706a.clone();
    }
}
