package qi;
public final class j0 {
    public static final j0 f46775a;
    public static final j0 f46776b;
    public static final j0 f46777c;
    public static final j0[] d;

    static {
        ?? r02 = new Enum("HIGH", 0);
        f46775a = r02;
        ?? r12 = new Enum("MEDIUM", 1);
        f46776b = r12;
        ?? r32 = new Enum("LOW", 2);
        f46777c = r32;
        d = new j0[]{r02, r12, r32};
    }

    public static j0 valueOf(String str) {
        return (j0) Enum.valueOf(j0.class, str);
    }

    public static j0[] values() {
        return (j0[]) d.clone();
    }
}
