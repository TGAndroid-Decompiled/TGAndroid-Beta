package zf;
public final class b {
    public static final b f49216a;
    public static final b f49217b;
    public static final b[] f49218c;

    static {
        ?? r02 = new Enum("STARS", 0);
        f49216a = r02;
        ?? r12 = new Enum("TON", 1);
        f49217b = r12;
        f49218c = new b[]{r02, r12};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f49218c.clone();
    }
}
