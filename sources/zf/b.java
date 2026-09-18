package zf;
public final class b {
    public static final b f48982a;
    public static final b f48983b;
    public static final b[] f48984c;

    static {
        ?? r02 = new Enum("STARS", 0);
        f48982a = r02;
        ?? r12 = new Enum("TON", 1);
        f48983b = r12;
        f48984c = new b[]{r02, r12};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f48984c.clone();
    }
}
