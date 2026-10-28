package ui;
public final class h {
    public static final h f49964a;
    public static final h f49965b;
    public static final h[] f49966c;

    static {
        ?? r02 = new Enum("DISABLED", 0);
        f49964a = r02;
        ?? r12 = new Enum("RNNOISE", 1);
        f49965b = r12;
        f49966c = new h[]{r02, r12};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f49966c.clone();
    }
}
