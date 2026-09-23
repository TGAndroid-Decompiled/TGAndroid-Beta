package x7;
public final class b0 {
    public static final b0 f45315a;
    public static final b0[] f45316b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f45315a = r02;
        f45316b = new b0[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static b0[] values() {
        return (b0[]) f45316b.clone();
    }
}
