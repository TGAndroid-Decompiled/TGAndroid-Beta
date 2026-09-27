package zf;
public final class b {
    public static final b f49270a;
    public static final b f49271b;
    public static final b[] f49272c;

    static {
        ?? r02 = new Enum("STARS", 0);
        f49270a = r02;
        ?? r12 = new Enum("TON", 1);
        f49271b = r12;
        f49272c = new b[]{r02, r12};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f49272c.clone();
    }
}
