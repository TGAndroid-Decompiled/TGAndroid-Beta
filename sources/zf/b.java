package zf;
public final class b {
    public static final b f54564a;
    public static final b f54565b;
    public static final b[] f54566c;

    static {
        ?? r02 = new Enum("STARS", 0);
        f54564a = r02;
        ?? r12 = new Enum("TON", 1);
        f54565b = r12;
        f54566c = new b[]{r02, r12};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f54566c.clone();
    }
}
