package x7;
public final class b0 {
    public static final b0 f50748a;
    public static final b0[] f50749b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f50748a = r02;
        f50749b = new b0[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static b0[] values() {
        return (b0[]) f50749b.clone();
    }
}
