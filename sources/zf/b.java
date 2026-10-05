package zf;
public final class b {
    public static final b f53323a;
    public static final b f53324b;
    public static final b[] f53325c;

    static {
        ?? r02 = new Enum("STARS", 0);
        f53323a = r02;
        ?? r12 = new Enum("TON", 1);
        f53324b = r12;
        f53325c = new b[]{r02, r12};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f53325c.clone();
    }
}
