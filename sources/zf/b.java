package zf;
public final class b {
    public static final b f49208a;
    public static final b f49209b;
    public static final b[] f49210c;

    static {
        ?? r02 = new Enum("STARS", 0);
        f49208a = r02;
        ?? r12 = new Enum("TON", 1);
        f49209b = r12;
        f49210c = new b[]{r02, r12};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f49210c.clone();
    }
}
