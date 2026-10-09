package zf;
public final class b {
    public static final b f54441a;
    public static final b f54442b;
    public static final b[] f54443c;

    static {
        ?? r02 = new Enum("STARS", 0);
        f54441a = r02;
        ?? r12 = new Enum("TON", 1);
        f54442b = r12;
        f54443c = new b[]{r02, r12};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f54443c.clone();
    }
}
