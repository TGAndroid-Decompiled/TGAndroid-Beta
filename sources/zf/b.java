package zf;
public final class b {
    public static final b f48947a;
    public static final b f48948b;
    public static final b[] f48949c;

    static {
        ?? r02 = new Enum("STARS", 0);
        f48947a = r02;
        ?? r12 = new Enum("TON", 1);
        f48948b = r12;
        f48949c = new b[]{r02, r12};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f48949c.clone();
    }
}
