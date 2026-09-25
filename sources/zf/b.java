package zf;
public final class b {
    public static final b f49228a;
    public static final b f49229b;
    public static final b[] f49230c;

    static {
        ?? r02 = new Enum("STARS", 0);
        f49228a = r02;
        ?? r12 = new Enum("TON", 1);
        f49229b = r12;
        f49230c = new b[]{r02, r12};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f49230c.clone();
    }
}
