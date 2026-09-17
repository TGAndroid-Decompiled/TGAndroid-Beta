package zf;
public final class b {
    public static final b f51625a;
    public static final b f51626b;
    public static final b[] f51627c;

    static {
        ?? r02 = new Enum("STARS", 0);
        f51625a = r02;
        ?? r12 = new Enum("TON", 1);
        f51626b = r12;
        f51627c = new b[]{r02, r12};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f51627c.clone();
    }
}
