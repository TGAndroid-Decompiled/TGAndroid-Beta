package zf;
public final class b {
    public static final b f53302a;
    public static final b f53303b;
    public static final b[] f53304c;

    static {
        ?? r02 = new Enum("STARS", 0);
        f53302a = r02;
        ?? r12 = new Enum("TON", 1);
        f53303b = r12;
        f53304c = new b[]{r02, r12};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f53304c.clone();
    }
}
