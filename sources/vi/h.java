package vi;
public final class h {
    public static final h f56974a;
    public static final h f56975b;
    public static final h[] f56976c;

    static {
        ?? r02 = new Enum("DISABLED", 0);
        f56974a = r02;
        ?? r12 = new Enum("RNNOISE", 1);
        f56975b = r12;
        f56976c = new h[]{r02, r12};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f56976c.clone();
    }
}
