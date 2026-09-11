package x7;
public final class b0 {
    public static final b0 f48931a;
    public static final b0[] f48932b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f48931a = r02;
        f48932b = new b0[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static b0[] values() {
        return (b0[]) f48932b.clone();
    }
}
