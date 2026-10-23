package ri;
public final class h {
    public static final h f46237a;
    public static final h f46238b;
    public static final h[] f46239c;

    static {
        ?? r02 = new Enum("DISABLED", 0);
        f46237a = r02;
        ?? r12 = new Enum("RNNOISE", 1);
        f46238b = r12;
        f46239c = new h[]{r02, r12};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f46239c.clone();
    }
}
