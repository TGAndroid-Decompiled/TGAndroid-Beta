package zf;
public final class b {
    public static final b f49274a;
    public static final b f49275b;
    public static final b[] f49276c;

    static {
        ?? r02 = new Enum("STARS", 0);
        f49274a = r02;
        ?? r12 = new Enum("TON", 1);
        f49275b = r12;
        f49276c = new b[]{r02, r12};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f49276c.clone();
    }
}
