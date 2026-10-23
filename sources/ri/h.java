package ri;
public final class h {
    public static final h f45816a;
    public static final h f45817b;
    public static final h[] f45818c;

    static {
        ?? r02 = new Enum("DISABLED", 0);
        f45816a = r02;
        ?? r12 = new Enum("RNNOISE", 1);
        f45817b = r12;
        f45818c = new h[]{r02, r12};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f45818c.clone();
    }
}
