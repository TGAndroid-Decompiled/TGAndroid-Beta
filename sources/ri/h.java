package ri;
public final class h {
    public static final h f46236a;
    public static final h f46237b;
    public static final h[] f46238c;

    static {
        ?? r02 = new Enum("DISABLED", 0);
        f46236a = r02;
        ?? r12 = new Enum("RNNOISE", 1);
        f46237b = r12;
        f46238c = new h[]{r02, r12};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f46238c.clone();
    }
}
