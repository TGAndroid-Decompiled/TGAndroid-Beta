package zf;
public final class b {
    public static final b f49229a;
    public static final b f49230b;
    public static final b[] f49231c;

    static {
        ?? r02 = new Enum("STARS", 0);
        f49229a = r02;
        ?? r12 = new Enum("TON", 1);
        f49230b = r12;
        f49231c = new b[]{r02, r12};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f49231c.clone();
    }
}
