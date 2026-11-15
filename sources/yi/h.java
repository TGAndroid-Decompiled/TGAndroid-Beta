package yi;
public final class h {
    public static final h f60745a;
    public static final h f60746b;
    public static final h[] f60747c;

    static {
        ?? r02 = new Enum("DISABLED", 0);
        f60745a = r02;
        ?? r12 = new Enum("RNNOISE", 1);
        f60746b = r12;
        f60747c = new h[]{r02, r12};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f60747c.clone();
    }
}
