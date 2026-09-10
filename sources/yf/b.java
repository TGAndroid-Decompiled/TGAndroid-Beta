package yf;
public final class b {
    public static final b f46928a;
    public static final b f46929b;
    public static final b[] f46930c;

    static {
        ?? r02 = new Enum("STARS", 0);
        f46928a = r02;
        ?? r12 = new Enum("TON", 1);
        f46929b = r12;
        f46930c = new b[]{r02, r12};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f46930c.clone();
    }
}
