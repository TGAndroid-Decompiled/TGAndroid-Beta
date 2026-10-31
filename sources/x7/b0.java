package x7;
public final class b0 {
    public static final b0 f53099a;
    public static final b0[] f53100b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f53099a = r02;
        f53100b = new b0[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static b0[] values() {
        return (b0[]) f53100b.clone();
    }
}
