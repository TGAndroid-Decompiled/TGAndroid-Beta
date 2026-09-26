package zf;
public final class b {
    public static final b f49226a;
    public static final b f49227b;
    public static final b[] f49228c;

    static {
        ?? r02 = new Enum("STARS", 0);
        f49226a = r02;
        ?? r12 = new Enum("TON", 1);
        f49227b = r12;
        f49228c = new b[]{r02, r12};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f49228c.clone();
    }
}
