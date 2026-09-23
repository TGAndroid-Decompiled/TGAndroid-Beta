package zf;
public final class b {
    public static final b f48898a;
    public static final b f48899b;
    public static final b[] f48900c;

    static {
        ?? r02 = new Enum("STARS", 0);
        f48898a = r02;
        ?? r12 = new Enum("TON", 1);
        f48899b = r12;
        f48900c = new b[]{r02, r12};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f48900c.clone();
    }
}
