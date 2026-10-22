package ri;
public final class h {
    public static final h f45815a;
    public static final h f45816b;
    public static final h[] f45817c;

    static {
        ?? r02 = new Enum("DISABLED", 0);
        f45815a = r02;
        ?? r12 = new Enum("RNNOISE", 1);
        f45816b = r12;
        f45817c = new h[]{r02, r12};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f45817c.clone();
    }
}
