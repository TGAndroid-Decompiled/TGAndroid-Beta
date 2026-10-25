package ui;
public final class h {
    public static final h f49926a;
    public static final h f49927b;
    public static final h[] f49928c;

    static {
        ?? r02 = new Enum("DISABLED", 0);
        f49926a = r02;
        ?? r12 = new Enum("RNNOISE", 1);
        f49927b = r12;
        f49928c = new h[]{r02, r12};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f49928c.clone();
    }
}
