package zf;
public final class b {
    public static final b f49227a;
    public static final b f49228b;
    public static final b[] f49229c;

    static {
        ?? r02 = new Enum("STARS", 0);
        f49227a = r02;
        ?? r12 = new Enum("TON", 1);
        f49228b = r12;
        f49229c = new b[]{r02, r12};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f49229c.clone();
    }
}
