package zf;
public final class b {
    public static final b f54530a;
    public static final b f54531b;
    public static final b[] f54532c;

    static {
        ?? r02 = new Enum("STARS", 0);
        f54530a = r02;
        ?? r12 = new Enum("TON", 1);
        f54531b = r12;
        f54532c = new b[]{r02, r12};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f54532c.clone();
    }
}
