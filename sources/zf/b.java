package zf;
public final class b {
    public static final b f49254a;
    public static final b f49255b;
    public static final b[] f49256c;

    static {
        ?? r02 = new Enum("STARS", 0);
        f49254a = r02;
        ?? r12 = new Enum("TON", 1);
        f49255b = r12;
        f49256c = new b[]{r02, r12};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f49256c.clone();
    }
}
