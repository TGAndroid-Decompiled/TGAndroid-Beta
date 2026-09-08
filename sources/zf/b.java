package zf;
public final class b {
    public static final b f51655a;
    public static final b f51656b;
    public static final b[] f51657c;

    static {
        ?? r02 = new Enum("STARS", 0);
        f51655a = r02;
        ?? r12 = new Enum("TON", 1);
        f51656b = r12;
        f51657c = new b[]{r02, r12};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f51657c.clone();
    }
}
