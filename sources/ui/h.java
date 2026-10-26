package ui;
public final class h {
    public static final h f49929a;
    public static final h f49930b;
    public static final h[] f49931c;

    static {
        ?? r02 = new Enum("DISABLED", 0);
        f49929a = r02;
        ?? r12 = new Enum("RNNOISE", 1);
        f49930b = r12;
        f49931c = new h[]{r02, r12};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f49931c.clone();
    }
}
