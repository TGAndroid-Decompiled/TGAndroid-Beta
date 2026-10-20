package ri;
public final class h {
    public static final h f45812a;
    public static final h f45813b;
    public static final h[] f45814c;

    static {
        ?? r02 = new Enum("DISABLED", 0);
        f45812a = r02;
        ?? r12 = new Enum("RNNOISE", 1);
        f45813b = r12;
        f45814c = new h[]{r02, r12};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f45814c.clone();
    }
}
