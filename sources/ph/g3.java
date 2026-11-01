package ph;
public final class g3 {
    public static final g3 f45078a;
    public static final g3 f45079b;
    public static final g3 f45080c;
    public static final g3[] d;

    static {
        ?? r02 = new Enum("BY_PRICE", 0);
        f45078a = r02;
        ?? r12 = new Enum("BY_DATE", 1);
        f45079b = r12;
        ?? r32 = new Enum("BY_NUMBER", 2);
        f45080c = r32;
        d = new g3[]{r02, r12, r32};
    }

    public static g3 valueOf(String str) {
        return (g3) Enum.valueOf(g3.class, str);
    }

    public static g3[] values() {
        return (g3[]) d.clone();
    }
}
