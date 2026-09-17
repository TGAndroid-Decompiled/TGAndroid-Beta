package zf;
public final class b {
    public static final b f48977a;
    public static final b f48978b;
    public static final b[] f48979c;

    static {
        ?? r02 = new Enum("STARS", 0);
        f48977a = r02;
        ?? r12 = new Enum("TON", 1);
        f48978b = r12;
        f48979c = new b[]{r02, r12};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f48979c.clone();
    }
}
