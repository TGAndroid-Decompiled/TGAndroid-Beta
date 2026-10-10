package zf;
public final class b {
    public static final b f54487a;
    public static final b f54488b;
    public static final b[] f54489c;

    static {
        ?? r02 = new Enum("STARS", 0);
        f54487a = r02;
        ?? r12 = new Enum("TON", 1);
        f54488b = r12;
        f54489c = new b[]{r02, r12};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f54489c.clone();
    }
}
