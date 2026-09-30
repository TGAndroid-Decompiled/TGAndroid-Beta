package zf;
public final class b {
    public static final b f49335a;
    public static final b f49336b;
    public static final b[] f49337c;

    static {
        ?? r02 = new Enum("STARS", 0);
        f49335a = r02;
        ?? r12 = new Enum("TON", 1);
        f49336b = r12;
        f49337c = new b[]{r02, r12};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f49337c.clone();
    }
}
