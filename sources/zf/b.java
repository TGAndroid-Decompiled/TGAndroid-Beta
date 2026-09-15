package zf;
public final class b {
    public static final b f48954a;
    public static final b f48955b;
    public static final b[] f48956c;

    static {
        ?? r02 = new Enum("STARS", 0);
        f48954a = r02;
        ?? r12 = new Enum("TON", 1);
        f48955b = r12;
        f48956c = new b[]{r02, r12};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f48956c.clone();
    }
}
